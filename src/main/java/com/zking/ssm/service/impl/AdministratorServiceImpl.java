package com.zking.ssm.service.impl;

import com.zking.ssm.model.Administrator;
import com.zking.ssm.service.IAdministratorService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AdministratorServiceImpl implements IAdministratorService {
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(Administrator record) {
        return 0;
    }

    @Override
    public int insertSelective(Administrator record) {
        return 0;
    }

    @Override
    public Administrator selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Administrator record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Administrator record) {
        return 0;
    }
}
