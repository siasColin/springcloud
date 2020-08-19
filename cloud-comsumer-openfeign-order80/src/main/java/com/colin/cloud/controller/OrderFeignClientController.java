package com.colin.cloud.controller;

import com.colin.cloud.entities.CommonResult;
import com.colin.cloud.service.PaymentFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Package: com.colin.cloud.controller
 * @Author: sxf
 * @Date: 2020-7-31
 * @Description:
 */
@RestController
@RequestMapping("/consumer")
public class OrderFeignClientController {
    @Autowired
    private PaymentFeignService paymentFeignService;

    /**
     * 根据id查询
     *
     * @param id
     * @return
     */
    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id) {
        return paymentFeignService.getPaymentById(id);
    }

}
