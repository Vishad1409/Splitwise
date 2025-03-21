package com.vishad.Splitwise.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.lang.reflect.Member;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "groups")
public class Group extends BaseModel {

    private String name;
    private String createdBy;
    private LocalDateTime createdDate;
    private double totalAmountSpent;

    @ManyToMany
    private List<User> members;

    @OneToMany
    private List<Expense> expense;

    @OneToMany
    private List<SettlementTransaction> settlementTransactions;
}
