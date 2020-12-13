package com.zking.ssm.mapper;

import com.zking.ssm.model.Shop;
import org.springframework.stereotype.Repository;

@Repository
public interface ShopMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Shop record);

    int insertSelective(Shop record);

    Shop selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Shop record);

    int updateByPrimaryKey(Shop record);
}