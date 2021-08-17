package com.example.springcloud.service;


import com.example.springcloud.entity.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Component
@FeignClient(value = "CLOUD-PROVIDER-PAYMENT")
public interface OrderService {

    @GetMapping("/provider/payment/get/{id}")
    public @ResponseBody
    CommonResult getMsg(@PathVariable Integer id);
}
