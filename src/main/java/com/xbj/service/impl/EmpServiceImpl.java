package com.xbj.service.impl;

import com.xbj.dao.EmpMapper;
import com.xbj.domain.Emp;
import com.xbj.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpMapper empMapper;

    @Override
    public List<Map> getAllEmp() {
        Emp emp = new Emp();
        return empMapper.getAllEmp(emp);
    }
}
