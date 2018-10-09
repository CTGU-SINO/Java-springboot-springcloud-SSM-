package com.ctgu.eurekaconsumerfeign.Controller;

import com.ctgu.eurekaconsumerfeign.Feign.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {

    @Autowired
    HelloRemote helloRemote;

    @GetMapping("/hello")
    public String index(@RequestParam(value = "name") String name) {
        return helloRemote.hello(name + "!");
    }

}
