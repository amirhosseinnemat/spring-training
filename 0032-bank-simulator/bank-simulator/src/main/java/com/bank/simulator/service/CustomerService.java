package com.bank.simulator.service;

import com.bank.simulator.entity.BankEntity;
import com.bank.simulator.entity.CustomerEntity;

import java.util.Optional;

public interface CustomerService {

    public void save(CustomerEntity customer, BankEntity bank);

    public CustomerEntity findById(Long id);
}
