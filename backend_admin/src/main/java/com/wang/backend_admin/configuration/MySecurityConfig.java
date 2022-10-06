package com.wang.backend_admin.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.web.SecurityFilterChain;

@Primary
@Configuration
@EnableWebSecurity
public class MySecurityConfig {

    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.csrf().ignoringAntMatchers("/druid/*");
        http.formLogin().disable();
        return http.build();
    }
    @Bean
    public WebSecurityCustomizer webSecurityCustomizer() throws Exception {
        return (web) -> web
                .ignoring()
                .antMatchers("/doc.html")
                .antMatchers("/swagger/**")
                .antMatchers("/swagger-ui.html")
                .antMatchers("/webjars/**")
                .antMatchers("/v2/api-docs-ext/**")
                .antMatchers("/swagger-resources/**")
                .antMatchers("/doc.html");
    }

}
