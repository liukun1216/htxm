package com.zking.ssm.service;

import com.zking.ssm.model.Bankcard;
import org.springframework.stereotype.Repository;

public interface IBankcardService {
    int deleteByPrimaryKey(Integer id);

    int insert(Bankcard record);

    int insertSelective(Bankcard record);

    Bankcard selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Bankcard record);

    int updateByPrimaryKey(Bankcard record);
}