package com.sample.dao;

import org.springframework.stereotype.Component;

@Component
public class UserDao {
    public void add(String name) {
        System.out.println(getClass().getSimpleName() + " DAO operation.");
    }
}
