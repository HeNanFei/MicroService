package server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("server.mapper")
@EnableCircuitBreaker
public class DeptHytrixProvider8001 {
    public static void main(String[] args) {
        SpringApplication.run(DeptHytrixProvider8001.class,args);
    }
}
