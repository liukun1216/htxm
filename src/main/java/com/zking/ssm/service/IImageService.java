package com.zking.ssm.service;

import com.zking.ssm.model.Image;
import org.springframework.stereotype.Repository;

public interface IImageService {
    int deleteByPrimaryKey(Integer id);

    int insert(Image record);

    int insertSelective(Image record);

    Image selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Image record);

    int updateByPrimaryKey(Image record);
}