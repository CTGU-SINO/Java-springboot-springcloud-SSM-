package com.ctgu.spring.factorybean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain4 {

    public static void main(String[] args) {
        ApplicationContext cxt = new ClassPathXmlApplicationContext("bean-beanfactory.xml");
        Car car = (Car) cxt.getBean("car");
        System.out.println(car);
    }
}
