package com.zjt.server.Controller;

import com.zjt.pojo.Dept;
import com.zjt.server.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DeptController {
    @Autowired
    private DeptService ds;

    @RequestMapping("/dept/findAll")
    public List<Dept> findAll(){

        return ds.findAll();
    }
    @RequestMapping("/dept/find/{id}")
    public Dept findDept(@PathVariable("id")long id){
        return ds.findById(id);
    }
}
