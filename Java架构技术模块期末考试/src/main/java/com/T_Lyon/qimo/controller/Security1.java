package com.T_Lyon.qimo.controller;

import com.T_Lyon.qimo.mapper.userMapper;
import com.T_Lyon.qimo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class Security1 {
    @Autowired
    userMapper userMapper;

    @RequestMapping("/my/login")
    public String login(String username, String password) {
        List<User> user = userMapper.getUser();
        int pd = 0;
        for (int i = 0; i < user.size(); i++) {
            if (user.get(i).getName() == username && user.get(i).getPassword() == password) {
                pd = 1;
            }
        }
        if (pd == 1) {
            System.out.println("登录成功");
        } else {
            System.out.println("正在登录");
        }
        return "my/login";
    }

    @RequestMapping("/my/error")
    public String error() {
        System.out.println("账号密码错误");
        return "my/login";
    }

    @RequestMapping("/my/logout")
    public String logout() {
        System.out.println("登出");
        return "my/login";
    }

    @RequestMapping({"/", "/user/home"})
    public String home() {
        System.out.println("进入主页");
        return "user/home";
    }

    @RequestMapping("/user/self")
    public String userSelf() {
        System.out.println("进入个人页面");
        return "user/self";
    }

    @RequestMapping("/admin/self")
    public String adminSelf() {
        System.out.println("进入管理员页面");
        return "admin/self";
    }
}
