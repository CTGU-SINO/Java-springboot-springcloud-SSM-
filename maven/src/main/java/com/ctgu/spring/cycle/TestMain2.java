package com.ctgu.spring.cycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain2 {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext cxt = new ClassPathXmlApplicationContext("bean-cycle.xml");
        Car car = (Car) cxt.getBean("car");
        System.out.println(car);
        cxt.close();
    }
}
