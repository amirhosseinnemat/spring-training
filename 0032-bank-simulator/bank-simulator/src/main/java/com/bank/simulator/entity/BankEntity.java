package com.bank.simulator.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "bank_simulator2")
public class BankEntity {

    @Id
    @Column(name = "branch_code")
    private Long branchCode;

    @Column(name = "name")
    private String name;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "branch_code")
    private List<CustomerEntity> customerEntities;

    public BankEntity() {
    }

    public Long getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(Long branchCode) {
        this.branchCode = branchCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<CustomerEntity> getCustomerEntities() {
        return customerEntities;
    }

    public void setCustomerEntities(List<CustomerEntity> customerEntities) {
        this.customerEntities = customerEntities;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankEntity bank = (BankEntity) o;
        return branchCode.equals(bank.branchCode) && name.equals(bank.name) && customerEntities.equals(bank.customerEntities);
    }

    @Override
    public int hashCode() {
        return Objects.hash(branchCode, name, customerEntities);
    }
}
