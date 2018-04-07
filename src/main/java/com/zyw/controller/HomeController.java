package com.zyw.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: 欢迎控制器
 * @Author: zyw
 * @Date: 2018/3/31
 */
@RestController
@RequestMapping("/home")
public class HomeController {

    @GetMapping("/hello")
    public String hello(){
        return "HelloWorld";
    }
}
