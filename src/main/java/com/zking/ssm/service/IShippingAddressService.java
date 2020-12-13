package com.zking.ssm.service;

import com.zking.ssm.model.ShippingAddress;
import org.springframework.stereotype.Repository;

public interface IShippingAddressService {
    int deleteByPrimaryKey(Integer id);

    int insert(ShippingAddress record);

    int insertSelective(ShippingAddress record);

    ShippingAddress selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ShippingAddress record);

    int updateByPrimaryKey(ShippingAddress record);
}