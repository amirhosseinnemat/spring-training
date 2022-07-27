package ir.shaparak.controller;


import ir.shaparak.dao.CustomerDAO;
import ir.shaparak.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    CustomerDAO customerDAO;

    @RequestMapping("/")
    public String goHome() {
        return "index";
    }

    @RequestMapping("/customer-list")
    public String customer_list(Model model) {

        // load customers
        List<Customer> customers = customerDAO.getCustomers();

        // add to model
        model.addAttribute("customers", customers);

        return "customer-list";
    }
}
