package com.snehalata.aws.beanstalk2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @ResponseBody
    @RequestMapping("test")
    public static String hello(){
        return  "my hello world";
    }
}
