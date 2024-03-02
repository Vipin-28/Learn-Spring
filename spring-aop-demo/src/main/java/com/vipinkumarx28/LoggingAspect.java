package com.vipinkumarx28;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* com.vipinkumarx28.ShoppingCart.checkout(..))")
    public void beforelogger(){
        System.out.println("Loggers");
    }

    @After("execution (* com.vipinkumarx28.ShoppingCart.checkout(..))")
    public void afterLogger(){
        System.out.println("After Loggers");
    }
}
