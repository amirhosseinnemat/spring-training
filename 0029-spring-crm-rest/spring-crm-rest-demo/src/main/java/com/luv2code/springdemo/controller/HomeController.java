package com.luv2code.springdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mvc")
public class HomeController {

    @RequestMapping("/home")
    public String showHome() {
        return "home";
    }
}
