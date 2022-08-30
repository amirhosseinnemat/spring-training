package com.bank.simulator.service;

import com.bank.simulator.dao.BankRepository;
import com.bank.simulator.dao.CustomerRepository;
import com.bank.simulator.entity.BankEntity;
import com.bank.simulator.entity.CustomerEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class CustomerServiceImpl implements CustomerService{

    private CustomerRepository customerRepository;
    private BankRepository bankRepository;

    @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository, BankRepository bankRepository) {
        this.customerRepository = customerRepository;
        this.bankRepository = bankRepository;
    }


    @Override
    public void save(CustomerEntity customer, BankEntity bank) {
        bankRepository.save(bank);
        customerRepository.save(customer);
    }

    @Override
    public Optional<CustomerEntity> findById(Long id) {

    return customerRepository.findById(id);
    }


    @Override
    public CustomerEntity test(Long id) {

        Optional<CustomerEntity> optional = customerRepository.findById(id);
        CustomerEntity customer = optional.orElse(null);
        if(customer != null) {
            Long iban = customer.getIban();
            System.out.println(iban);
        }
        return customer;
    }
}
