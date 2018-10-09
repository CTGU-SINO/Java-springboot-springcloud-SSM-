package com.ctgu.spring.aop_xml;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

import java.util.Arrays;
import java.util.List;

public class LoggingAspect {

    public void beforeMethod(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        List<Object> args = Arrays.asList(joinPoint.getArgs());
        System.out.println("before:" + methodName + ":" + args);
    }

    public void afterMethod(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        System.out.println("after:" + methodName + " ends");
    }

    public void afterReturning(JoinPoint joinPoint, Object result) {
        String methodName = joinPoint.getSignature().getName();
        System.out.println("afterReturning:" + methodName + " ends:" + result);
    }


    public void afterThrowing(JoinPoint joinPoint, Exception ex) {
        String methodName = joinPoint.getSignature().getName();
        System.out.println("afterThrowing:" + methodName + " ends:" + ex);
    }

    public Object around(ProceedingJoinPoint pjt) {
        Object result = null;
        String methodName = pjt.getSignature().getName();
        try {
            System.out.println("beforeAround:" + methodName + ":" + Arrays.asList(pjt.getArgs()));
            result = pjt.proceed();
            System.out.println("resultAround:" + methodName + " ends:" + result);
        } catch (Throwable e) {
            e.printStackTrace();
            System.out.println("exception:" + e);
        }
        System.out.println("afterAround:" + methodName + " ends");
        return result;
    }
}
