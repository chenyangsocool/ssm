package com.chenyangsocool.ssm.service.impl;

import com.chenyangsocool.ssm.dao.TestDao;
import com.chenyangsocool.ssm.model.Test;
import com.chenyangsocool.ssm.service.ITestService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TestServiceImpl implements ITestService {
    @Resource
    private TestDao testDao;

    @Override
    public Test getModelById(int id) {
        return testDao.getModelById(id);
    }
}