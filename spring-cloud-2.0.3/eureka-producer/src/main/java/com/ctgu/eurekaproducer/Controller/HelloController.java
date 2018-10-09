package com.ctgu.eurekaproducer.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class HelloController {

    @Value("${config.producer.instance:0}")
    private int instance;

    @GetMapping("/hello")
    public String hello(@RequestParam String name) {
        return "[" + instance + "]" + "Hello, " + name + " " + new Date();
    }
}
