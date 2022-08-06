package ir.shaparak.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
@Aspect
public class LogAspect {

    // create logger
    private Logger logger = Logger.getLogger(getClass().getSimpleName());

    // controller
    @Pointcut("execution(* ir.shaparak.controller.*.*(..))")
    private void forControllerPackage() {
    }

    // service
    @Pointcut("execution(* ir.shaparak.service.*.*(..))")
    private void forServicePackage() {
    }

    // dao
    @Pointcut("execution(* ir.shaparak.dao.*.*(..))")
    private void forDaoPackage() {
    }

    // for all pointcut
    @Pointcut("forControllerPackage() || forServicePackage() || forDaoPackage()")
    public void forAppFollow() {
    }

    // add @Before advice
    @Before("forAppFollow()")
    public void before(JoinPoint theJoinPoint) {

        // display method we are calling
        String theMethod = theJoinPoint.getSignature().toShortString();
        logger.info("=====>>>>> LOG : @Before on method : " + theMethod);

    }

    // add @AfterReturning advice
    @AfterReturning(pointcut = "forAppFollow()", returning = "theResult")
    public void afterReturning(JoinPoint joinPoint, Object theResult) {

        String theMethod = joinPoint.getSignature().toShortString();
        logger.info("=====>>>>> LOG : @AfterReturning on method : " + theMethod);

        // display the result
        logger.info("=====>>>>> LOG : result : " + theResult);

    }

}
