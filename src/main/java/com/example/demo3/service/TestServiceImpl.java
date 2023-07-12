package com.example.demo3.service;

import org.springframework.stereotype.Service;

/**
 * @author Cubeatz
 * @version 1.0.0
 * @date 2023/7/12 17:43
 */
@Service
public class TestServiceImpl implements TestService{

    @Override
    public String test(){
        return"aa";
    }
}
