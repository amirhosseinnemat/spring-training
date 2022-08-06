package com.sample.aspects;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectDemo {


    @Before("execution(* com.sample.file.FileReading.ReadFile())")
    public void doBefore(JoinPoint joinPoint) {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println(methodSignature);
        System.out.println("=====>>>>> @Before");
    }


    @AfterThrowing(pointcut = "execution(* com.sample.file.FileReading.ReadFile())", throwing = "exception")
    public void afterThrowing(JoinPoint joinPoint, Throwable exception) {

        System.out.println("=====>>>>> @AfterThrowing on method : " + joinPoint.getSignature().toShortString());
        System.out.println("=====>>>>> Exception is : " + exception);
    }
}