package com.example.hellodemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HellodemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(HellodemoApplication.class, args);
        System.out.println("程序启动成功");
    }

}
