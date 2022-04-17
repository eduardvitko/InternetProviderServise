package com.dto;

public class WalletDto {
    private int id;
    private String number;
    private int balance;
    private int customerId;

    public WalletDto() {
    }

    public WalletDto(String number, int balance, int customerId) {
        this.number = number;
        this.balance = balance;
        this.customerId = customerId;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
}
