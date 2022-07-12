package com.sample;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/new")
public class MainController {

    @RequestMapping("/hello")
    public String newPage() {
        return "new-page";
    }
}
