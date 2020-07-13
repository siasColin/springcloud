package com.colin.cloud.service;

import com.colin.cloud.entities.Payment;

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
