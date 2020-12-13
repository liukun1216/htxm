package com.zking.ssm.service;

import com.zking.ssm.model.CommodityOrder;
import org.springframework.stereotype.Repository;

public interface ICommodityOrderService {
    int deleteByPrimaryKey(Integer id);

    int insert(CommodityOrder record);

    int insertSelective(CommodityOrder record);

    CommodityOrder selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CommodityOrder record);

    int updateByPrimaryKey(CommodityOrder record);
}