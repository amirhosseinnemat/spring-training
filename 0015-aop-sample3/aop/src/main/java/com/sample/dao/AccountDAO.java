package com.sample.dao;

import org.springframework.stereotype.Component;

@Component
public class AccountDAO {

    private String name;
    private String family;

    public void addAccount() {
        System.out.println(getClass().getSimpleName() + " -  DAO operation : Add account");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }
}
