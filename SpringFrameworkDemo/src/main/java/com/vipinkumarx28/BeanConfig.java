package com.vipinkumarx28;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.vipinkumarx28")
public class BeanConfig {

    @Bean
    public Doctor doctor(){
        return new Doctor();
    }
}
