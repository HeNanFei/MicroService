package com.zjt.server.mapper;

import com.zjt.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface DeptMapper {

     boolean addDept(Dept dept);

     Dept findById(Long id);

     List<Dept> findAll();


}
