package com.example.springcloud.dao;

import com.example.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PaymentDao {

    Payment getMsgById(Integer id);

}
