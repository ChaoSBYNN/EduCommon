package com.edu.intercepters;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class InterceptConfig implements WebMvcConfigurer {
    @Value("${baseUrl:/java_admin/}")
    private String baseUrl;

    public void addInterceptors(InterceptorRegistry registry) {
        InterceptorRegistration registration = registry.addInterceptor(new WebInterceptor());     //拦截的对象会进入这个类中进行判断
//        registration.addPathPatterns(baseUrl + "/**");

//        registration.excludePathPatterns(baseUrl + "/host_nearby_list/**", baseUrl + "/list/**", baseUrl + "/check/**", baseUrl + "/status/**");
    }
}
