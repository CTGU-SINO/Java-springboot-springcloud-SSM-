package com.ctgu.eurekaconsumerribbon.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/hello")
    public String hello(@RequestParam String name) {
        name += "!";
        String url = "http://eureka-producer/hello?name=" + name;
        return restTemplate.getForObject(url, String.class);
    }
}
