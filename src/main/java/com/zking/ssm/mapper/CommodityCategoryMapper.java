package com.zking.ssm.mapper;

import com.zking.ssm.model.CommodityCategory;
import org.springframework.stereotype.Repository;

@Repository
public interface CommodityCategoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CommodityCategory record);

    int insertSelective(CommodityCategory record);

    CommodityCategory selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CommodityCategory record);

    int updateByPrimaryKey(CommodityCategory record);
}