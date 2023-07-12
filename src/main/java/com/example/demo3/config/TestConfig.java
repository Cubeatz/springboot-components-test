package com.example.demo3.config;

import com.example.demo3.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

/**
 * @author Cubeatz
 * @version 1.0.0
 * @date 2023/7/12 18:40
 */
@Configuration
public class TestConfig {

    @Autowired
    private TestService testService;
}
