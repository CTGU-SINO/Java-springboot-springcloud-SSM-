package com.spring.config;

import com.spring.bean.Person;
import org.springframework.context.annotation.*;

@Configuration
public class MainConfig2 {

//    singleton：IOC启动就创建
//    prototype:从IOC获取时创建
    @Scope("singleton")
    @Bean("person")
    @Lazy
    public Person person(){
        System.out.println("给容器中添加person。。。");
        return new Person("lisi", 21);
    }
}
