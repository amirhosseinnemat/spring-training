package ir.shaparak.controller;


import ir.shaparak.dao.CustomerDAO;
import ir.shaparak.entity.Customer;
import ir.shaparak.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    CustomerService customerService;

    @GetMapping("/")
    public String goHome() {
        return "index";
    }

    @RequestMapping("/customer-list")
    public String customer_list(Model model) {

        // load customers
        List<Customer> customers = customerService.getCustomers();

        // add to model
        model.addAttribute("customers", customers);

        return "customer-list";
    }

    @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model model) {

        // create customer and bind it to model
        Customer customer = new Customer();

        model.addAttribute("customer", customer);

        return "add-form";
    }

    @PostMapping("/saveCustomer")
    public String saveCustomer(@ModelAttribute("customer") Customer customer) {

       // save customer
        customerService.saveCustomer(customer);

        return "redirect: customer-list";
    }

    @GetMapping("/showFormForUpdate")
    public String showFormForUpdate(@RequestParam("customerId") int theId, Model model) {

        Customer customer = customerService.getCustomer(theId);

        model.addAttribute("customer",customer);


        return "add-form";
    }


//    delete
    @GetMapping("/delete")
    public String deleteCustomer(@RequestParam("customerId") int theId) {

        customerService.deleteCustomer(theId);
        return "redirect: customer-list";
    }
}
