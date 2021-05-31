package com.T_Lyon.springboot01helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication ：标注这个类是一个springBoot的应用
@SpringBootApplication
public class Springboot01HelloworldApplication {
    //将SpringBoot应用启动
    public static void main(String[] args) {
        SpringApplication.run(Springboot01HelloworldApplication.class, args);
    }

}
