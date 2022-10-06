package com.wang.backend_admin.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import java.io.File;

@Configuration
public class WebMvcConfig extends WebMvcConfigurationSupport {
    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/systemPictures/**")
                .addResourceLocations("file:"+System.getProperty("user.dir")+ File.separator+"uploadFile"+File.separator+"systemPictures"+File.separator);
        registry.addResourceHandler("/uploadFile/pluginFiles/logo/**")
                .addResourceLocations("file:"+System.getProperty("user.dir")+File.separator+"uploadFile"+File.separator+"pluginFiles"+File.separator+"logo"+File.separator);
        registry.addResourceHandler("doc.html")
                .addResourceLocations("classpath:/META-INF/resources/");
        registry.addResourceHandler("/webjars/**")
                .addResourceLocations("classpath:/META-INF/resources/webjars/");
    }
}
