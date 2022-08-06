package com.sample.aspects;


import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.aspectj.lang.annotation.Aspect;

@Component
@Aspect
public class AspectDemo {


    @Pointcut("execution(public void com.sample.dao.AccountDAO.add*())")
    public void daoPointCut() {
    }

    // pointcut for setter
    @Pointcut("execution(* com.sample.dao.*.set*(..))")
    public void setter() {
    }

    // pointcut for getter
    @Pointcut("execution(* com.sample.dao.*.get*(..))")
    public void getter() {
    }

    // no getter setter
    @Pointcut("(setter() || getter())")
    public void doBeforeWithoutSetterAndGetter() {
    }

    //    @Before("execution(public void addAccount())")
//    @Before("daoPointCut()")
//    public void logBeforadd() {
//        System.out.println("=======>>>> @Before Logging before the execution of method add. ");
//    }

    @Before("doBeforeWithoutSetterAndGetter()")
    public void logBeforeNoGetterSetter() {
        System.out.println("=============>>>>>> @Before no Getter and Setter");
    }

//    @After("execution(public void add())")
//    public void logAfterUserDao() {
//        System.out.println("============>>> after user dao");
//    }
}
