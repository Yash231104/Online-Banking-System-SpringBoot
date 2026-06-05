package com.banking.BankingApp.dtos;

import com.banking.BankingApp.enums.TransactionType;
import java.time.LocalDateTime;

public class TransactionResponse {

    private long transaction_id;
    private TransactionType type;
    private LocalDateTime time;
    private long senderAccount;
    private long receiverAccount;
    private double amount;

    public TransactionResponse() {
    }

    public TransactionResponse(long transaction_id,
                               TransactionType type,
                               LocalDateTime time,
                               long senderAccount,
                               long receiverAccount,
                               double amount) {
        this.transaction_id = transaction_id;
        this.type = type;
        this.time = time;
        this.senderAccount = senderAccount;
        this.receiverAccount = receiverAccount;
        this.amount = amount;
    }

    public long getTransaction_id() {
        return transaction_id;
    }

    public void setTransaction_id(long transaction_id) {
        this.transaction_id = transaction_id;
    }

    public TransactionType getType() {
        return type;
    }

    public void setType(TransactionType type) {
        this.type = type;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public long getSenderAccount() {
        return senderAccount;
    }

    public void setSenderAccount(long senderAccount) {
        this.senderAccount = senderAccount;
    }

    public long getReceiverAccount() {
        return receiverAccount;
    }

    public void setReceiverAccount(long receiverAccount) {
        this.receiverAccount = receiverAccount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}