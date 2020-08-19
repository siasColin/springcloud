package com.colin.cloud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan({"com.colin.cloud.dao"})
public class MyBatisConfig {
}
