package com.zjt.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication

public class Port {
    public static void main(String[] args) {
        SpringApplication.run(Port.class,args);
    }
}
