package com.zking.ssm.service.impl;

import com.zking.ssm.model.Evaluation;
import com.zking.ssm.service.IEvaluationService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class EvaluationServiceImpl implements IEvaluationService {
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(Evaluation record) {
        return 0;
    }

    @Override
    public int insertSelective(Evaluation record) {
        return 0;
    }

    @Override
    public Evaluation selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Evaluation record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeyWithBLOBs(Evaluation record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Evaluation record) {
        return 0;
    }
}
