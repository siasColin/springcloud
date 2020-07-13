package com.colin.cloud.service;

import com.colin.cloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @Package: com.colin.cloud.service
 * @Author: sxf
 * @Date: 2020-7-7
 * @Description:
 */
public interface PaymentService {
    int create(Payment payment);

    Payment getPaymentById(Long id);
}
