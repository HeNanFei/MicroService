package com.zjt.server.controller;

import com.zjt.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class ConsumerController {
    //private static final  String url = "http://localhost:8001";
    private static final String url = "http://MICROSERVICECLOUD-DEPT";
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/consumer/find/{id}")
    public Dept getDept(@PathVariable("id") long id){

        return restTemplate.getForObject(url+"/dept/find/"+id,Dept.class);
    }
    @RequestMapping("/comsumer/findAll")
    public List<Dept> getList(){
        return restTemplate.getForObject(url+"/dept/findAll",List.class);
    }
}
