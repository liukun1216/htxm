package com.zking.ssm.mapper;

import com.zking.ssm.model.OrderProcessingRecord;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderProcessingRecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OrderProcessingRecord record);

    int insertSelective(OrderProcessingRecord record);

    OrderProcessingRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OrderProcessingRecord record);

    int updateByPrimaryKey(OrderProcessingRecord record);
}