package com.sample.aspects;


import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.aspectj.lang.annotation.Aspect;

@Component
@Aspect
public class AspectDemo {


    @Pointcut("execution(public void add*())")
    public void daoPointCut(){}

//    @Before("execution(public void addAccount())")
    @Before("daoPointCut()")
    public void logBeforadd() {
        System.out.println("=======>>>> @Before Logging before the execution of method add. ");
    }

    @After("execution(public void add())")
    public void logAfterUserDao() {
        System.out.println("============>>> after user dao");
    }
}
