package com.ctgu.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain7 {

    public static void main(String[] args) {
//        ArithmeticCalculator calculator = new ArithmeticCalculatorImpl();
//        ArithmeticCalculatorProxy proxy = new ArithmeticCalculatorProxy(calculator);
//        ArithmeticCalculator target = (ArithmeticCalculator) proxy.createProxy();
        ApplicationContext cxt = new ClassPathXmlApplicationContext("bean-aop.xml");
        ArithmeticCalculator target = (ArithmeticCalculator) cxt.getBean("arithmeticCalculator");
        target.add(3, 6);
        target.sub(6, 3);
        target.mul(3, 6);
        target.div(6, 3);
//        target.div(6, 0);
    }
}
