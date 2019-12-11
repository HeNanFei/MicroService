package com.zjt.server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.zjt.server.mapper")
public class DeptProvider8002 {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvider8002.class,args);
    }
}
