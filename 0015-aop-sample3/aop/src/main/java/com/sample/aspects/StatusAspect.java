package com.sample.aspects;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(2)
public class StatusAspect {

    @Before("execution(* com.sample.dao.UserDao.add())")
    public void addStatus() {
        System.out.println("===== STATUS >>>>> before method");
    }
}
