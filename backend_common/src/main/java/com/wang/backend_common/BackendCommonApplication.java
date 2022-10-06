package com.wang.backend_common;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = {"com.wang.backend_common.mapper"})
public class BackendCommonApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackendCommonApplication.class, args);
    }

}
