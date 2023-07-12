package com.example.demo3.web;

import com.example.demo3.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Cubeatz
 * @version 1.0.0
 * @date 2023/7/12 17:42
 */
@RestController
public class TestController {

    @Autowired
    private TestService testService;


    @GetMapping("/")
    public String test(){
        return testService.test();
    }
}
