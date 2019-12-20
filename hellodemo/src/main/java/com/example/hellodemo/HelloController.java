package com.example.hellodemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author feng
 * @version 1.0
 * @date 2019/12/20 14:51
 */
@RequestMapping
@RestController
public class HelloController {

    @RequestMapping("/getMsg")
    public String getMsg(){
        return "第一个msg";
    }
}
