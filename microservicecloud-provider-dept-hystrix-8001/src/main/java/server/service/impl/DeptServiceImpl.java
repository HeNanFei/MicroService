package server.service.impl;

import com.zjt.pojo.Dept;

import org.springframework.stereotype.Service;
import server.mapper.DeptMapper;
import server.service.DeptService;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {

    @Resource
    private DeptMapper dm;

    @Override
    public boolean addDept(Dept dept) {
        return false;
    }

    @Override
    public Dept findById(Long id) {
        return dm.findById(id);
    }

    @Override
    public List<Dept> findAll() {
        return dm.findAll();
    }
}
