package com.zking.ssm.service.impl;

import com.zking.ssm.model.Image;
import com.zking.ssm.service.IImageService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ImageServiceImpl implements IImageService {
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(Image record) {
        return 0;
    }

    @Override
    public int insertSelective(Image record) {
        return 0;
    }

    @Override
    public Image selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Image record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Image record) {
        return 0;
    }
}
