package com.bank.simulator.controller;


import com.bank.simulator.dto.BankDTO;
import com.bank.simulator.dto.CustomerDTO;
import com.bank.simulator.entity.BankEntity;
import com.bank.simulator.entity.CustomerEntity;
import com.bank.simulator.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



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
    public CustomerEntity setCustomerSimulatorEntity(@PathVariable("customerId") long customerId) {

        CustomerDTO customerDTO = new CustomerDTO();
        BankDTO bankDTO = new BankDTO();

//        if (customerService.findById(customerId).isPresent()) {
//            return customerService.findById(customerId).get();
//        } else {
//            throw new RuntimeException("customer not found with id : " + customerId);
//        }

        return customerService.test(customerId);
    }
}
