package com.Geekster.springAnnotations;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    @Bean
    public MyObject myObject() {
        return new MyObject("Geekster!!!");
    }
}
