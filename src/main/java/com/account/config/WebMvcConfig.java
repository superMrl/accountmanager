package com.account.config;

import org.springframework.boot.autoconfigure.web.WebMvcAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * 静态资源处理
 * Created by superMrl on 2018/7/22.
 */
@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {

        if(!registry.hasMappingForPattern("/static/**")){
            registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
        }
        if(!registry.hasMappingForPattern("/templates/**")){
            registry.addResourceHandler("/templates/**").addResourceLocations("classpath:/templates/");
        }
        super.addResourceHandlers(registry);
    }
}
