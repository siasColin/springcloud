package com.colin.cloud.dao;

import com.colin.cloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Package: com.colin.cloud.dao
 * @Author: sxf
 * @Date: 2020-7-7
 * @Description:
 */
@Mapper
public interface PaymentDao {
    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}
