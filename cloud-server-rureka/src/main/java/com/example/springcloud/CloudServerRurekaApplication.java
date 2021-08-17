package com.example.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CloudServerRurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudServerRurekaApplication.class, args);
    }

}
