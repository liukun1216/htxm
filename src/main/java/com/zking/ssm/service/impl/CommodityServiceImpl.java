package com.zking.ssm.service.impl;

import com.zking.ssm.model.Commodity;
import com.zking.ssm.service.ICommodityService;
import org.springframework.stereotype.Service;

@Service
public class CommodityServiceImpl implements ICommodityService {
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(Commodity record) {
        return 0;
    }

    @Override
    public int insertSelective(Commodity record) {
        return 0;
    }

    @Override
    public Commodity selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Commodity record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeyWithBLOBs(Commodity record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Commodity record) {
        return 0;
    }
}
