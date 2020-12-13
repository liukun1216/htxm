package com.zking.ssm.service.impl;

import com.zking.ssm.model.CommodityCategory;
import com.zking.ssm.service.ICommodityCategoryService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CommodityCategoryServiceImpl implements ICommodityCategoryService {
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(CommodityCategory record) {
        return 0;
    }

    @Override
    public int insertSelective(CommodityCategory record) {
        return 0;
    }

    @Override
    public CommodityCategory selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(CommodityCategory record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(CommodityCategory record) {
        return 0;
    }
}
