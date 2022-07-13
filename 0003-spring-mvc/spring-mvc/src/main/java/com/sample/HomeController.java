package com.sample;


import com.sample.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
    public String resultForm(@ModelAttribute("student") Student theStudent) {

        System.out.println("student log : " + theStudent.getName() + " " + theStudent.getFamily());

        return "process-one";
    }
}
