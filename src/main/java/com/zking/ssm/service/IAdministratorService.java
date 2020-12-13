package com.zking.ssm.service;

import com.zking.ssm.model.Administrator;
import org.springframework.stereotype.Repository;

public interface IAdministratorService {
    int deleteByPrimaryKey(Integer id);

    int insert(Administrator record);

    int insertSelective(Administrator record);

    Administrator selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Administrator record);

    int updateByPrimaryKey(Administrator record);
}