package com.ctgu.eureka_register_service_master;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaRegisterServiceMasterApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaRegisterServiceMasterApplication.class, args);
    }
}
