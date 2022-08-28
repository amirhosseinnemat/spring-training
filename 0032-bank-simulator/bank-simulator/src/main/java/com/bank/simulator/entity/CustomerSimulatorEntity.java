package com.bank.simulator.entity;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Table(name = "CUSTOMER_SIMULATOR", schema = "TRAINING2", catalog = "")
public class CustomerSimulatorEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "IBAN")
    private BigInteger iban;
    @Basic
    @Column(name = "CARD_NUMBER")
    private BigInteger cardNumber;
    @Basic
    @Column(name = "CVV")
    private BigInteger cvv;
    @Basic
    @Column(name = "EXPIRATION_DATE")
    private String expirationDate;
    @Basic
    @Column(name = "BALANCE")
    private BigInteger balance;
    @Basic
    @Column(name = "BRANCH_CODE")
    private BigInteger branchCode;

    public BigInteger getIban() {
        return iban;
    }

    public void setIban(BigInteger iban) {
        this.iban = iban;
    }

    public BigInteger getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(BigInteger cardNumber) {
        this.cardNumber = cardNumber;
    }

    public BigInteger getCvv() {
        return cvv;
    }

    public void setCvv(BigInteger cvv) {
        this.cvv = cvv;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public BigInteger getBalance() {
        return balance;
    }

    public void setBalance(BigInteger balance) {
        this.balance = balance;
    }

    public BigInteger getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(BigInteger branchCode) {
        this.branchCode = branchCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CustomerSimulatorEntity that = (CustomerSimulatorEntity) o;

        if (iban != null ? !iban.equals(that.iban) : that.iban != null) return false;
        if (cardNumber != null ? !cardNumber.equals(that.cardNumber) : that.cardNumber != null) return false;
        if (cvv != null ? !cvv.equals(that.cvv) : that.cvv != null) return false;
        if (expirationDate != null ? !expirationDate.equals(that.expirationDate) : that.expirationDate != null)
            return false;
        if (balance != null ? !balance.equals(that.balance) : that.balance != null) return false;
        if (branchCode != null ? !branchCode.equals(that.branchCode) : that.branchCode != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = iban != null ? iban.hashCode() : 0;
        result = 31 * result + (cardNumber != null ? cardNumber.hashCode() : 0);
        result = 31 * result + (cvv != null ? cvv.hashCode() : 0);
        result = 31 * result + (expirationDate != null ? expirationDate.hashCode() : 0);
        result = 31 * result + (balance != null ? balance.hashCode() : 0);
        result = 31 * result + (branchCode != null ? branchCode.hashCode() : 0);
        return result;
    }
}
