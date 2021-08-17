package com.example.springcloud.controller;

import com.example.springcloud.entity.CommonResult;
import com.example.springcloud.entity.Payment;
import com.example.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class PaymentController {


    @Autowired
    private PaymentService paymentService;

    @Value("${server.port}")
    String serverPort;

    @GetMapping("/provider/payment/get/{id}")
    public @ResponseBody
    CommonResult getMsg(@PathVariable Integer id){
       Payment payment = paymentService.getMsgById(id);
       return new CommonResult<Payment>(200,"查询信息成功，端口号位："+serverPort,payment);
    }

}
