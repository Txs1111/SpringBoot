package com.T_Lyon.springboot01helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//热部署

@Controller
@RequestMapping("/hello")
public class HelloController {
    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        String q = "1";
        int a = 123123;
        String s = a + "";
        System.out.println();
        Integer integer = new Integer(q);
        System.out.println(integer);
        return "hello";
    }
}
