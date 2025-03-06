package com.vishad.Splitwise.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.Currency;

@Entity
@Getter
@Setter
public class SettlementTransaction extends BaseModel{

    @ManyToOne
    private User borrower;
    @ManyToOne
    private User lendor;
    private double amount;
    private Currency currency;

}
