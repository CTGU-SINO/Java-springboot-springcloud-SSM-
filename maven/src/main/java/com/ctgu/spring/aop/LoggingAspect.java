package com.ctgu.spring.aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/*
 * Order,数值越小优先级越高；
*/

@Order(1)
@Aspect
@Component
public class LoggingAspect {

    @Pointcut("execution(* com.ctgu.spring.aop.ArithmeticCalculator.*(..))")
    public void declareJoinPointExpression(){}

    @Before("declareJoinPointExpression()")
    public void beforeMethod(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        List<Object> args = Arrays.asList(joinPoint.getArgs());
        System.out.println("before:" + methodName + ":" + args);
    }

    @After("declareJoinPointExpression()")
    public void afterMethod(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        System.out.println("after:" + methodName + " ends");
    }

    @AfterReturning(value="declareJoinPointExpression()",
            returning="result")
    public void afterReturning(JoinPoint joinPoint, Object result) {
        String methodName = joinPoint.getSignature().getName();
        System.out.println("afterReturning:" + methodName + " ends:" + result);
    }

    @AfterThrowing(value="declareJoinPointExpression()",
            throwing="ex")
    public void afterThrowing(JoinPoint joinPoint, Exception ex) {
        String methodName = joinPoint.getSignature().getName();
        System.out.println("afterThrowing:" + methodName + " ends:" + ex);
    }

    @Around("declareJoinPointExpression()")
    public Object around(ProceedingJoinPoint pjt) {
        Object result = null;
        String methodName = pjt.getSignature().getName();
        try {
            System.out.println("beforeAround:" + methodName + ":" + Arrays.asList(pjt.getArgs()));
            result = pjt.proceed();
            System.out.println("resultAround:" + methodName + " ends:" + result);
        } catch (Throwable e) {
            e.printStackTrace();
            System.out.println("exception:"+e);
        }
        System.out.println("afterAround:" + methodName + " ends");
        return result;
    }
}
