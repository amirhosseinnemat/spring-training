package com.sample.model;

import com.sample.CompanyValidator;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


public class Student {

    @NotEmpty
    private String name;
    @NotEmpty
    private String family;

    @CompanyValidator
    private String company;

    public Student() {
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
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
