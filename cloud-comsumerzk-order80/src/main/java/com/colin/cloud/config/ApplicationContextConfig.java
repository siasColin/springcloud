package com.colin.cloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Package: com.colin.cloud.config
 * @Author: sxf
 * @Date: 2020-7-9
 * @Description: 全局配置类
 */
@Configuration
public class ApplicationContextConfig {
    @Bean
    @LoadBalanced//开启负载均衡
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
