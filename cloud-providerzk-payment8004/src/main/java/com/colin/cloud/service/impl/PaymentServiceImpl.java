package com.colin.cloud.service.impl;

import com.colin.cloud.dao.PaymentDao;
import com.colin.cloud.entities.Payment;
import com.colin.cloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Package: com.colin.cloud.service.impl
 * @Author: sxf
 * @Date: 2020-7-7
 * @Description:
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
