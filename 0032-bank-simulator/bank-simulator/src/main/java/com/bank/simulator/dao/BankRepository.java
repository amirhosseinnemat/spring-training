package com.bank.simulator.dao;

import com.bank.simulator.entity.BankEntity;
import org.springframework.data.jpa.repository.JpaRepository;



public interface BankRepository extends JpaRepository<BankEntity, Long> {
}
