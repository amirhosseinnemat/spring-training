package com.restsample.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class HomeRestController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World";
    }

    @GetMapping("/bye")
    public String sayGoodBye() {
        return "GoodBye";
    }
}
