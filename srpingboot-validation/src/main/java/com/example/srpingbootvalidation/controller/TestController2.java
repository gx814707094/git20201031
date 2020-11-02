package com.example.srpingbootvalidation.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname TestController2
 * @Description
 * @Date 2020/10/31 16:58
 * @Created gengxiao
 */

@RestController
public class TestController2 {

    @GetMapping("/test")
    public String test(){
        return "";
    }
}
