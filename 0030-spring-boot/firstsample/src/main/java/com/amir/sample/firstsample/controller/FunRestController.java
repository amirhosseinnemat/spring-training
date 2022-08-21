package com.amir.sample.firstsample.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController

public class FunRestController {

    @GetMapping("/")
    public String sayHello() {
        return "Hello, world : " + LocalDateTime.now();
    }

    @GetMapping("/bye")
    public String sayGoodbye() {
        return "Goodbye : " + LocalDateTime.now();
    }


}
