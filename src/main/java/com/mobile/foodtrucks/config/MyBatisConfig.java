package com.mobile.foodtrucks.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.mobile.foodtrucks.dao")
public class MyBatisConfig {
}
