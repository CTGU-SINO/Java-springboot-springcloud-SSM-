package com.ctgu.spring.generic.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain6 {

    public static void main(String[] args) {
        ApplicationContext cxt = new ClassPathXmlApplicationContext("bean-generic-di.xml");
        UserService userService = (UserService) cxt.getBean("userService");
        userService.add();
    }
}
