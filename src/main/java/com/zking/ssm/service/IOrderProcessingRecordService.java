package com.zking.ssm.service;

import com.zking.ssm.model.OrderProcessingRecord;
import org.springframework.stereotype.Repository;

public interface IOrderProcessingRecordService {
    int deleteByPrimaryKey(Integer id);

    int insert(OrderProcessingRecord record);

    int insertSelective(OrderProcessingRecord record);

    OrderProcessingRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OrderProcessingRecord record);

    int updateByPrimaryKey(OrderProcessingRecord record);
}