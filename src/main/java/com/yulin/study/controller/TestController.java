package com.yulin.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/test")
@Controller
public class TestController {


    @GetMapping("/a")
    @ResponseBody
    public String a(){
        return "测试成功！";
    }
}
