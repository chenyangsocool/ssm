package com.chenyangsocool.ssm.service;

import com.chenyangsocool.ssm.model.Test;

import javax.jws.WebService;

@WebService
public interface ITestService {
    public Test getModelById(int id);
}