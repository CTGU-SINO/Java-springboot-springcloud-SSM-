package com.ctgu.spring.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.SQLException;

public class TestMain1 {

    public static void main(String[] args) throws SQLException {
//        HelloWorld helloWorld = new HelloWorld();
//        helloWorld.setName("CT");
//        helloWorld.hello();

        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloWorld helloWorld = (HelloWorld) ctx.getBean("helloWorld");
        System.out.println(helloWorld);

        Car car1 = (Car) ctx.getBean("car1");
        System.out.println(car1);

        Car car2 = (Car) ctx.getBean("car2");
        System.out.println(car2);

        Person person = (Person) ctx.getBean("person");
        System.out.println(person);

        Person person1 = (Person) ctx.getBean("person1");
        System.out.println(person1);

        Person person2 = (Person) ctx.getBean("person2");
        System.out.println(person2);

        Mother mother = (Mother) ctx.getBean("mother");
        System.out.println(mother);

        DataSource1 dataSource1 = (DataSource1) ctx.getBean("dataSource1");
        System.out.println(dataSource1.getProperties());
        System.out.println(dataSource1);

        DataSource dataSource = (DataSource) ctx.getBean("dataSource");
        System.out.println(dataSource.getConnection());
    }
}
