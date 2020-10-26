package com.licoded.daos.controller;

import com.licoded.daos.dao.UserService;
import com.licoded.tools.resModel.SuccessModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HelloWorld {
    @GetMapping("/hello")
    String hello(){
        System.out.println("come in");
        return "Hello World!";
    }
    @Resource
    private UserService userService;
    @GetMapping(value = "/hello2", produces="application/json;charset=UTF-8")
    String hello2(){
        System.out.println("come in2");
        return new SuccessModel(userService.findAll()).toString();
    }
}
