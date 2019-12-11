package com.zjt.server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.zjt.server.mapper")
public class DeptProvider8003 {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvider8003.class,args);
    }
}
