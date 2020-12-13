package com.zking.ssm.service.impl;

import com.zking.ssm.model.CommodityOrderDetail;
import com.zking.ssm.service.ICommodityOrderDetailService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CommodityOrderDetailServiceImpl implements ICommodityOrderDetailService {
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(CommodityOrderDetail record) {
        return 0;
    }

    @Override
    public int insertSelective(CommodityOrderDetail record) {
        return 0;
    }

    @Override
    public CommodityOrderDetail selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(CommodityOrderDetail record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(CommodityOrderDetail record) {
        return 0;
    }
}
