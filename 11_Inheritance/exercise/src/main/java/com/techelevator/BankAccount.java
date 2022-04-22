package com.techelevator;

public class BankAccount {
    private String accountHolderName;
    private String accountNumber;
    private int balance;

// Constructors v
    public BankAccount(String accountHolderName, String accountNumber) {
    this.accountHolderName = accountHolderName;
    this.accountNumber = accountNumber;
    this.balance = 0;
    }

    public BankAccount(String accountHolderName, String accountNumber, int balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Getters v
    public String getAccountHolderName() {
        return this.accountHolderName;
    }
    public String getAccountNumber() {
        return this.accountNumber;
    }
    public int getBalance() {
        return this.balance;
    }
    //Methods v
    public int deposit(int amountToDeposit) {
       balance = balance = + amountToDeposit;
       return balance;
    }

    public int withdraw(int amountToWithdraw) {
        balance = balance - amountToWithdraw;
        return balance;
    }

}
