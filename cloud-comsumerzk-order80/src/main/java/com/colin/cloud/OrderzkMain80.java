package com.colin.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Package: com.colin.cloud
 * @Author: sxf
 * @Date: 2020-7-9
 * @Description:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderzkMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderzkMain80.class, args);
    }
}
