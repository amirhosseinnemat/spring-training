package com.bank.simulator.dto;

import com.bank.simulator.entity.BankEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDTO implements Serializable {

    private Long iban;
    private Long cardNumber;
    private Integer cvv;
    private String expirationDate;
    private Long balance;
    private BankDTO branch_code;

}
