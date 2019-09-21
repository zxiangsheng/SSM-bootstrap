package com.xbj.dao;

import com.xbj.domain.Emp;
import com.xbj.domain.EmpExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface EmpMapper {
    long countByExample(EmpExample example);

    int deleteByExample(EmpExample example);

    int insert(Emp record);

    int insertSelective(Emp record);

    List<Emp> selectByExample(EmpExample example);

    int updateByExampleSelective(@Param("record") Emp record, @Param("example") EmpExample example);

    int updateByExample(@Param("record") Emp record, @Param("example") EmpExample example);

    /**
     * 查询所有员工信息
     * @param emp
     * @return
     */
    List<Map> getAllEmp(Emp emp);
}