package com.zking.ssm.service.impl;

import com.zking.ssm.model.OrderProcessingRecord;
import com.zking.ssm.service.IOrderProcessingRecordService;
import org.springframework.stereotype.Service;

@Service
public class OrderProcessingRecordServiceImpl implements IOrderProcessingRecordService {
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(OrderProcessingRecord record) {
        return 0;
    }

    @Override
    public int insertSelective(OrderProcessingRecord record) {
        return 0;
    }

    @Override
    public OrderProcessingRecord selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(OrderProcessingRecord record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(OrderProcessingRecord record) {
        return 0;
    }
}
