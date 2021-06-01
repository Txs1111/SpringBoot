package com.T_Lyon.qimo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Security1 {


    @RequestMapping("/my/login")
    public String login() {
        return "my/login";
    }
    @RequestMapping("/my/error")
    public String error(){
        return "my/login";
    }

    @RequestMapping("/index")
    public String toLogin() {
        return "index";
    }

    @RequestMapping("/my/logout")
    public String logout() {
        return "my/login";
    }

    @RequestMapping({"/", "/user/home"})
    public String home() {
        return "user/home";
    }

    @RequestMapping("/user/self")
    public String userSelf() {
        return "user/self";
    }

    @RequestMapping("/admin/self")
    public String adminSelf() {
        return "admin/self";
    }
}
