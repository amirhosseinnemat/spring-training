package com.luv2code.springdemo.controller;


import com.luv2code.springdemo.entity.Customer;
import com.luv2code.springdemo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class SpringRestController {


    @Autowired
    private CustomerService customerService;


    @GetMapping("/customers")
    public List<Customer> getCustomers() {

        return customerService.getCustomers();
    }
}
