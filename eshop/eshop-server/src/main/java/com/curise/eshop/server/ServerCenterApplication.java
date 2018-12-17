package com.curise.eshop.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServerCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerCenterApplication.class, args);
    }
}
