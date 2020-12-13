package com.zking.ssm.service.impl;

import com.zking.ssm.model.Log;
import com.zking.ssm.service.ILogService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class LogServiceImpl implements ILogService {
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(Log record) {
        return 0;
    }

    @Override
    public int insertSelective(Log record) {
        return 0;
    }

    @Override
    public Log selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Log record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Log record) {
        return 0;
    }
}
