package com.vipinkumarx28;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AutheticationAspect {

    @Pointcut("within(com.vipinkumarx28..*)")
    public void autheticatingPointCut(){

    }

    @Pointcut("within(com.vipinkumarx28..*)")
    public void authorizationPointCut(){

    }

    @Before("autheticatingPointCut() && authorizationPointCut()")
    public void autheticate(){
        System.out.println("Authenticating the request.");
    }
}
