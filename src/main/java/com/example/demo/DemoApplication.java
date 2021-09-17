package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController{
    @RequestMapping("/hello")
    public static String sayHello(){
        return "Hello World! ";
    }
}
