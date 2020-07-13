package com.colin.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Package: com.colin.cloud
 * @Author: sxf
 * @Date: 2020-7-7
 * @Description:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentzkMain8004 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentzkMain8004.class, args);
    }
}
