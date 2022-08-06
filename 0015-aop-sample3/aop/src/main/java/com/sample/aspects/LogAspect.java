package com.sample.aspects;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(4) // lower number has higher precedence
public class LogAspect {

    @Before("execution(* com.sample.dao.UserDao.add(..))")
    public void addLog(JoinPoint joinPoint){
        System.out.println("===== LOG >>>>> before method");
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println(methodSignature);

        // print method signature
        Object[] args = joinPoint.getArgs();

        for (Object s : args) {
            System.out.println(s);
        }
    }
}
