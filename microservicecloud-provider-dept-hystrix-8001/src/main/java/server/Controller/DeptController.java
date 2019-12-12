package server.Controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.zjt.pojo.Dept;
import server.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import server.service.DeptService;

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
    @HystrixCommand(fallbackMethod = "messageBack")
    public Dept findDept(@PathVariable("id")long id){
       Dept dept =  ds.findById(id);
       if(dept == null){
           throw new RuntimeException("出错了，哥们");
       }

        return dept;
    }


    public Dept messageBack(@PathVariable("id") long id){
        Dept dept = new Dept();
        dept.setDname("没有当前的类"+id);
        dept.setDeptno(id);
        dept.setDeptno(1L);

        return dept;
    }
}
