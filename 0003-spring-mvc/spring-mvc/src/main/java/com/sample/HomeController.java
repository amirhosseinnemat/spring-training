package com.sample;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;


@Controller
public class HomeController {

    @RequestMapping("/")
    public String getIndex() {
        return "index";
    }

    @RequestMapping("/main-form")
    public String getForm() {
        return "main-form";
    }


//    process form v1
//
//    @RequestMapping("processForm")
//    public String processForm(HttpServletRequest request, Model model) {
//        String country = request.getParameter("country");
//        country = country.toUpperCase();
//
//        model.addAttribute("result", country);
//
//        return "result-form";
//    }


//    process form v2
    @RequestMapping("processForm")
    public String processForm(@RequestParam("country") String country, Model model) {

        String result = country + " - tehran";
        model.addAttribute("result", result);
        return "result-form";
    }


    @RequestMapping("/home")
    public String getHome() {
        return "home";
    }



}
