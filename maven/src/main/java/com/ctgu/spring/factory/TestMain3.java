package com.ctgu.spring.factory;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain3 {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext cxt = new ClassPathXmlApplicationContext("bean-factory.xml");

        Car car = (Car) cxt.getBean("car");
        System.out.println(car);

        Car car1 = (Car) cxt.getBean("car1");
        System.out.println(car1);
    }
}
