package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Value("${player.name}")
    private String name;
    @Value("${player.family}")
    private String family;

    @GetMapping("/test")
    public String sayHello() {
        return "Hello, Dolly";
    }

    @GetMapping("/getinfo")
    public String getInfo() {
        return name + " - " + family;
    }

}
