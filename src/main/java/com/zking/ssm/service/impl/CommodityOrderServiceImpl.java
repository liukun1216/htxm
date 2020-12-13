package com.zking.ssm.service.impl;

import com.zking.ssm.model.CommodityOrder;
import com.zking.ssm.service.ICommodityOrderService;
import org.springframework.stereotype.Service;

@Service
public class CommodityOrderServiceImpl implements ICommodityOrderService {
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(CommodityOrder record) {
        return 0;
    }

    @Override
    public int insertSelective(CommodityOrder record) {
        return 0;
    }

    @Override
    public CommodityOrder selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(CommodityOrder record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(CommodityOrder record) {
        return 0;
    }
}
