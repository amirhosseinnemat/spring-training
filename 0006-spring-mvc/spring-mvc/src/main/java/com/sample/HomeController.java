package com.sample;


import com.sample.model.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;

@Controller
public class HomeController {

//    @RequestMapping("/")
//    public String getIndex() {
//        return "index";
//    }

//    @RequestMapping("/process-one")
//    public String getProcessOne(@RequestParam("name") String name, Model model) {
//        String res = name.toUpperCase();
//        model.addAttribute("result", res);
//        return "process-one";
//    }

    @RequestMapping("/")
    public String processTwo(Model model) {

        model.addAttribute("student", new Student());
        return "index";
    }

    @RequestMapping("/result-form")
    public String resultForm(@Valid @ModelAttribute("student") Student theStudent, BindingResult bindingResult) {

        System.out.println("student log : " + theStudent.getName() + " " + theStudent.getFamily() + " " + theStudent.getCompany());

        if (bindingResult.hasErrors()) {
            return "index";
        } else {
            return "process-one";
        }
    }
}
