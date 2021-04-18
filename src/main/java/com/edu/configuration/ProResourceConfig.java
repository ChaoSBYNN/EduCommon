package com.edu.configuration;

import org.springframework.context.annotation.PropertySource;

@PropertySource(value = {"classpath:application.properties", "classpath:application.yml"}, ignoreResourceNotFound=true)
public class ProResourceConfig {
    public ProResourceConfig(){

    }
}
