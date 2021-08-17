package com.example.springcloud.service.impl;

import com.example.springcloud.dao.PaymentDao;
import com.example.springcloud.entity.Payment;
import com.example.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentDao paymentDao;
    @Override
    public Payment getMsgById(Integer id) {


        return paymentDao.getMsgById(id);
    }
}
