package com.luv2code.springdemo.controller;


import com.luv2code.springdemo.entity.Customer;
import com.luv2code.springdemo.exception.CustomerNotFoundException;
import com.luv2code.springdemo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    // add mapping for get customer with id
    @GetMapping("/customers/{customerId}")
    public Customer getCustomer(@PathVariable int customerId) {

        Customer customer = customerService.getCustomer(customerId);

        if (customer == null) {
            throw new CustomerNotFoundException("customer not found with id : " + customerId);
        }
        return customer;

    }

    // add mapping for POST / customers - add new customer

    @PostMapping("/customers")
    public Customer addCustomer(@RequestBody Customer theCustomer) {

        theCustomer.setId(0);
        customerService.saveCustomer(theCustomer);
        return theCustomer;
    }

    // add @PutMapping for updating existing customer
    @PutMapping("/customers")
    public Customer updateCustomer(@RequestBody Customer theCustomer) {

        Customer customer = customerService.getCustomer(theCustomer.getId());

        // throw exception if null

        if (customer == null) {
            throw new CustomerNotFoundException("customer not found with id : " + theCustomer.getId());
        }

        customerService.saveCustomer(theCustomer);

        return  theCustomer;
    }


    // add @DeleteMapping for deleting an user with id

    @DeleteMapping("/customers/{customerId}")
    public String deleteCustomer(@PathVariable int customerId) {

        Customer customer = customerService.getCustomer(customerId);

        // throw exception if null

        if (customer == null) {
            throw new CustomerNotFoundException("customer not found with id : " + customerId);
        }
        customerService.deleteCustomer(customerId);

        return "customer deleted with id : " + customerId;
    }





}
