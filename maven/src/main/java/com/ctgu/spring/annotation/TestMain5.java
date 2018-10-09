package com.ctgu.spring.annotation;

import com.ctgu.spring.annotation.controller.UserController;
import com.ctgu.spring.annotation.repository.UserRepository;
import com.ctgu.spring.annotation.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain5 {

    public static void main(String[] args) {
        ApplicationContext cxt = new ClassPathXmlApplicationContext("bean-annotation.xml");

        UserRepository userRepository = (UserRepository) cxt.getBean("userRepository");
        System.out.println(userRepository);

        TestObject to = (TestObject) cxt.getBean("testObject");
        System.out.println(to);

        UserService userService = (UserService) cxt.getBean("userService");
        System.out.println(userService);

        UserController userController = (UserController) cxt.getBean("userController");
        System.out.println(userController);

        userController.execute();
    }
}
