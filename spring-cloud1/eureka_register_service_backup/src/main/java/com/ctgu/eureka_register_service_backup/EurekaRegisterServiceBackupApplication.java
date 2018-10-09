package com.ctgu.eureka_register_service_backup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaRegisterServiceBackupApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaRegisterServiceBackupApplication.class, args);
    }
}
