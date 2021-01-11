package by.stetsko.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class OperationAspect {

    // TODO: 1/11/21 Logger logger = LogManager.getLogger(this.getClass());
    //ругается на logger

    @Pointcut("execution(* by.stetsko.operation.*.*(..))")
    public void allOperations() {
    }

    //Another operationMethod

    @Before("allOperations()")
    public void beforeOperations(JoinPoint joinPoint) {
        //logger
        System.out.println("Before operation starts");
    }

    @After("allOperations()")
    public void afterOperations(JoinPoint joinPoint) {
        //logger
        System.out.println("After operation started");
    }

    @AfterThrowing(value = "allOperations()", throwing = "e")
    public void afterOperationThrows(Throwable e) {
        e.printStackTrace();
        //logger
    }
}