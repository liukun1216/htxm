package com.zking.ssm.service;

import com.zking.ssm.model.CommodityOrderDetail;
import org.springframework.stereotype.Repository;

public interface ICommodityOrderDetailService {
    int deleteByPrimaryKey(Integer id);

    int insert(CommodityOrderDetail record);

    int insertSelective(CommodityOrderDetail record);

    CommodityOrderDetail selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CommodityOrderDetail record);

    int updateByPrimaryKey(CommodityOrderDetail record);
}