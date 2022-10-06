package com.wang.backend_admin.configuration;

import com.github.xiaoymin.knife4j.spring.annotations.EnableKnife4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import springfox.bean.validators.configuration.BeanValidatorPluginsConfiguration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
@EnableKnife4j
@Import(BeanValidatorPluginsConfiguration.class)
public class Knife4jConfiguration {
    @Bean
    public Docket createRestAPi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .groupName("develop")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.wang.backend_admin.controller"))
                .paths(PathSelectors.any())
                .build();
    }
    private ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title("毕业设计项目 - 接口文档")
                .description("本项目用于项目本人的接口展示和接口测试为用途。")
                .contact(new Contact("wang shichen", null, "wangshichen20314@gmail.com"))
                .version("v1.0.0")
                .build();
    }
}
