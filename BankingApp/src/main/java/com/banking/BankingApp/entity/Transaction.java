package com.banking.BankingApp.entity;

import com.banking.BankingApp.enums.TransactionType;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Data
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private  Long trans_id;
    @CreationTimestamp
    private LocalDateTime time;

    private double amount;

    @ManyToOne
    @JoinColumn(name = "account_id", nullable = false)
    private Account account;

    private long counterParty;
    @Column(length = 50)
    @Enumerated(EnumType.STRING)
    private TransactionType type;

    
    public Long getTrans_id() {
        return trans_id;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public double getAmount() {
        return amount;
    }

    public Account getAccount() {
        return account;
    }

    public long getCounterParty() {
        return counterParty;
    }

    public TransactionType getType() {
        return type;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public void setCounterParty(long counterParty) {
        this.counterParty = counterParty;
    }

    public void setType(TransactionType type) {
        this.type = type;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public void setTrans_id(Long trans_id) {
        this.trans_id = trans_id;
    }
}
