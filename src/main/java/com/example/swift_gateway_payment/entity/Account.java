package com.example.swift_gateway_payment.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "accounts")
public class Account {

    @Id
    @Column(name = "account_id", nullable = false)
    private String accountId;

    @Column(nullable = false)
    private BigDecimal balance;

    @Column(nullable = false)
    private String currency;

    // optional fields
    @Column(name = "owner_name")
    private String ownerName;

    // getters / setters
}