package com.zking.ssm.service.impl;

import com.zking.ssm.model.Shop;
import com.zking.ssm.service.IShopService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ShopServiceImpl implements IShopService {
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(Shop record) {
        return 0;
    }

    @Override
    public int insertSelective(Shop record) {
        return 0;
    }

    @Override
    public Shop selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Shop record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Shop record) {
        return 0;
    }
}
