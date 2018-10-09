package com.spring.test;

import com.spring.bean.Person;
import com.spring.config.MainConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTest {

    public static void main(String[] args) {
        ApplicationContext cxt =  new AnnotationConfigApplicationContext(MainConfig.class);
        Person person = cxt.getBean(Person.class);
        System.out.println(person);
        String[] namesForType = cxt.getBeanNamesForType(Person.class);
        for(String name:namesForType){
            System.out.println(name);
        }
    }
}
