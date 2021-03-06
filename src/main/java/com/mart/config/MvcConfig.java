package com.mart.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
public class MvcConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/home").setViewName("home.jsp");
        registry.addViewController("/").setViewName("home.jsp");
        registry.addViewController("/hello").setViewName("hello");
        registry.addViewController("/login").setViewName("login.jsp");
        registry.addViewController("/403").setViewName("403.jsp");
    }
    @Bean
    public InternalResourceViewResolver viewResolver(){
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/src/main/webapp/jsp/");
        resolver.setSuffix(".jsp");
        return resolver;
    }

}
