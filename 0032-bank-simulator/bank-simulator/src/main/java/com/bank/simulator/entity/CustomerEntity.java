package com.bank.simulator.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "customer_simulator2")
public class CustomerEntity {

    @Id
    @Column(name = "iban")
    private Long iban;

    @Column(name = "card_number")
    private Long cardNumber;

    @Column(name = "cvv")
    private Integer cvv;

    @Column(name = "expiration_date")
    private String expirationDate;

    @Column(name = "balance")
    private Long balance;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_branch_code", referencedColumnName = "branch_code")
    private BankEntity branch_code;

    public CustomerEntity() {
    }

    public Long getIban() {
        return iban;
    }

    public void setIban(Long iban) {
        this.iban = iban;
    }

    public Long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(Long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Integer getCvv() {
        return cvv;
    }

    public void setCvv(Integer cvv) {
        this.cvv = cvv;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public Long getBalance() {
        return balance;
    }

    public void setBalance(Long balance) {
        this.balance = balance;
    }

    public BankEntity getBranch_code() {
        return branch_code;
    }

    public void setBranch_code(BankEntity branch_code) {
        this.branch_code = branch_code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerEntity customer = (CustomerEntity) o;
        return iban.equals(customer.iban) && cardNumber.equals(customer.cardNumber) && cvv.equals(customer.cvv) && expirationDate.equals(customer.expirationDate) && balance.equals(customer.balance) && branch_code.equals(customer.branch_code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iban, cardNumber, cvv, expirationDate, balance, branch_code);
    }
}
