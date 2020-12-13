package com.zking.ssm.service.impl;

import com.zking.ssm.model.ShippingAddress;
import com.zking.ssm.service.IShippingAddressService;
import org.springframework.stereotype.Service;

@Service
public class ShippingAddressServiceImpl implements IShippingAddressService {
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(ShippingAddress record) {
        return 0;
    }

    @Override
    public int insertSelective(ShippingAddress record) {
        return 0;
    }

    @Override
    public ShippingAddress selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(ShippingAddress record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(ShippingAddress record) {
        return 0;
    }
}
