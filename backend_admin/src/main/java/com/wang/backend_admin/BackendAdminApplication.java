package com.wang.backend_admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@MapperScan(value = {"com.wang.backend_admin.mapper"})
@EnableWebMvc
public class BackendAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackendAdminApplication.class, args);
    }

}
