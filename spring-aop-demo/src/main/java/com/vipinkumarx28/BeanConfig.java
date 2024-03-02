package com.vipinkumarx28;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "com.vipinkumarx28")
@EnableAspectJAutoProxy
public class BeanConfig {

}
