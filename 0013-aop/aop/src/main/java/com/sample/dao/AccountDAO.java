package com.sample.dao;

import org.springframework.stereotype.Component;

@Component
public class AccountDAO {

    public void addAccount() {
        System.out.println(getClass().getSimpleName() + " -  DAO operation : Add account");
    }
}