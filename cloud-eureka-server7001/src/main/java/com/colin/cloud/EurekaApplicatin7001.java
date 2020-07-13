package com.colin.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Package: com.colin.cloud
 * @Author: sxf
 * @Date: 2020-7-7
 * @Description:
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApplicatin7001 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaApplicatin7001.class, args);
    }
}
