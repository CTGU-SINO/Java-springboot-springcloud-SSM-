package com.ctgu.eurekaclient.Controller;


import com.ctgu.eurekaclient.pojo.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private final Logger logger = LoggerFactory.getLogger(HelloController.class);

    @Autowired
    private DiscoveryClient client;

    @GetMapping("/hello")
    public String hello(){
        return "Hello Spring-Cloud";
    }

    @GetMapping("/getuser")
    public User add() {
        client.getServices().forEach(id -> {
            client.getInstances(id).forEach(instance -> {
                logger.info("/getuser, host:" + instance.getHost() + ", service_id:" + instance.getServiceId());
            });
        });
        User usr = new User();
        usr.setUsername("ccblog.cn");
        usr.setAge(10);
        return usr;
    }
}
