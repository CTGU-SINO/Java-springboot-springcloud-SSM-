package com.spring.config;

import com.spring.bean.Person;
import com.spring.service.BookService;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Configuration
//@ComponentScan(value="com.spring", excludeFilters={
//        @ComponentScan.Filter(type=FilterType.ANNOTATION,classes={Controller.class,Service.class})
//})
//@ComponentScan(value="com.spring", includeFilters={
//        @ComponentScan.Filter(type=FilterType.ANNOTATION, classes={Controller.class})
//}, useDefaultFilters=false)
@ComponentScans(
        value = {
                @ComponentScan(value="com.spring", includeFilters={
//                        @ComponentScan.Filter(type=FilterType.ANNOTATION, classes={Controller.class}),
//                        @ComponentScan.Filter(type=FilterType.ASSIGNABLE_TYPE, classes={BookService.class}),
                        @ComponentScan.Filter(type=FilterType.CUSTOM, classes={MyTypeFilter.class})
                }, useDefaultFilters=false)
        }
)
public class MainConfig {

    @Bean("person")
    public Person person01(){
        return new Person("zhangsan", 20);
    }
}
