package com.T_Lyon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Lyon
 * 2021-5-23 14:31:43
 */
@Controller
public class Security {
    @RequestMapping({"/my/login", "/"})
    public String login() {
        System.out.println("helloWorld");
        return "login";
    }
    @RequestMapping({"/my/toLogin", "/"})
    public String toLogin() {
        System.out.println("helloWorld");
        return "login";
    }

}
