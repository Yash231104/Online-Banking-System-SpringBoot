package com.banking.BankingApp.dtos;

public class TransferRequest {

    private double amount;
    private long receiverAccount;

    public TransferRequest() {
    }

    public TransferRequest(double amount, long receiverAccount) {
        this.amount = amount;
        this.receiverAccount = receiverAccount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public long getReceiverAccount() {
        return receiverAccount;
    }

    public void setReceiverAccount(long receiverAccount) {
        this.receiverAccount = receiverAccount;
    }
}