package com.bank.simulator.dao;

import com.bank.simulator.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;

public interface CustomerRepository extends JpaRepository<CustomerEntity, Long> {
}
