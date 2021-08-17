package com.example.springcloud.controller;

import com.example.springcloud.entity.CommonResult;
import com.example.springcloud.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class OrderController {

    @Resource
    private OrderService orderService;

    @RequestMapping("/consumer/order/feign/get/{id}")
    @ResponseBody
    public CommonResult getMsg(@PathVariable Integer id){
        return orderService.getMsg(id);
    }

}
