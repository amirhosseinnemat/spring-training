package com.bank.simulator.entity;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.List;

@Entity
@Table(name = "BANK_SIMULATOR", schema = "TRAINING2", catalog = "")
public class BankSimulatorEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "BRANCH_CODE")
    private BigInteger branchCode;
    @Basic
    @Column(name = "NAME")
    private String name;

    @OneToMany(mappedBy = "branchCode", cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    private List<CustomerSimulatorEntity> customers;

    public BigInteger getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(BigInteger branchCode) {
        this.branchCode = branchCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BankSimulatorEntity that = (BankSimulatorEntity) o;

        if (branchCode != null ? !branchCode.equals(that.branchCode) : that.branchCode != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = branchCode != null ? branchCode.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
