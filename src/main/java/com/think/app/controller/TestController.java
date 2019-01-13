package com.think.app.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {


    @RequestMapping("world")
    @ResponseBody
    public String helloWorld(){
        return "hello world";
    }

    @RequestMapping("/")
    public String model(){
        return "index/index";
    }

}
