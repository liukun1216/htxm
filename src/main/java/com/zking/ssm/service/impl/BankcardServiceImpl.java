package com.zking.ssm.service.impl;

import com.zking.ssm.model.Bankcard;
import com.zking.ssm.service.IBankcardService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BankcardServiceImpl implements IBankcardService {
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(Bankcard record) {
        return 0;
    }

    @Override
    public int insertSelective(Bankcard record) {
        return 0;
    }

    @Override
    public Bankcard selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Bankcard record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Bankcard record) {
        return 0;
    }
}
