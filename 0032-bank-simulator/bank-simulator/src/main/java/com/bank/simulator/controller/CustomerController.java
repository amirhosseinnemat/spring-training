package com.bank.simulator.controller;


import com.bank.simulator.entity.BankEntity;
import com.bank.simulator.entity.CustomerEntity;
import com.bank.simulator.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.util.Optional;

@RestController
@RequestMapping("/customer")
public class CustomerController {


    private CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }


    @GetMapping("/test")
    public String testCustomer() {
        return "this is a test from customer controller";
    }


    @PostMapping("/save")
    public String saveCustomer(@RequestBody CustomerEntity customer) {

        BankEntity bankEntity = new BankEntity();
        bankEntity.setBranchCode(customer.getBranch_code().getBranchCode());
        bankEntity.setName("pasargad");


        // save bank and customer

        customerService.save(customer, bankEntity);

        return "saved";
    }

    @GetMapping("/getCustomer/{customerId}")
    public CustomerEntity setCustomerSimulatorEntity(@PathVariable("customerId") long customerId){

//        BankEntity bank = new BankEntity();
//        bank.setName("pasargad");
//        bank.setBranchCode(1455L);
//
//        CustomerEntity customer = new CustomerEntity();
//        customer.setIban(12445L);
//        customer.setCardNumber(5022L);
//        customer.setCvv(588);
//        customer.setBalance(12000L);
//        customer.setExpirationDate("01/22");
//        customer.setBranch_code(bank);

        return customerService.findById(customerId);
    }
}
