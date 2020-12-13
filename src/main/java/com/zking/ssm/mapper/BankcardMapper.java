package com.zking.ssm.mapper;

import com.zking.ssm.model.Bankcard;
import org.springframework.stereotype.Repository;

@Repository
public interface BankcardMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Bankcard record);

    int insertSelective(Bankcard record);

    Bankcard selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Bankcard record);

    int updateByPrimaryKey(Bankcard record);
}