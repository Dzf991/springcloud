package com.example.springcloud.controller;

import com.example.springcloud.entity.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
public class OrderController {

    private static final String SERVER_PATH = "http://CLOUD-PROVIDER-PAYMENT";

    @Autowired
    private RestTemplate restTemplate;

    @ResponseBody
    @GetMapping("/consumer/order/get/{id}")
    public CommonResult getMsgById(@PathVariable Integer id){

        return restTemplate.getForObject(SERVER_PATH + "/provider/payment/get/"+id,CommonResult.class);
    }


}
