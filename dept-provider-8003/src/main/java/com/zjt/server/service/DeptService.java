package com.zjt.server.service;

import com.zjt.pojo.Dept;

import java.util.List;

public interface DeptService {
    public boolean addDept(Dept dept);

    public Dept findById(Long id);

    public List<Dept> findAll();
}
