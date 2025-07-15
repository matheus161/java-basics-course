package com.matheus161.javabasics.class43.labs.Exerc01;

public class BankAccount {
    private String clientName;
    private String accountNumber;
    private double balance;

    public BankAccount(String clientName, String accountNumber, double balance) {
        this.clientName = clientName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Client Name: '" + clientName + '\'' + "\n" +
                "Account Number: '" + accountNumber + '\'' + "\n" +
                "Balance: " + balance;
    }

    public void withdraw(double amount) {
        if (this.balance >= amount) {
            setBalance(this.balance - amount);
            System.out.println("Operation success: withdraw. " + "Balance: " + this.balance);
        } else {
            System.out.println("Operation denied: insufficient balance. "  + "Balance: " + this.balance);
        }
    }

    public void deposit(double amount) {
        setBalance(this.balance + amount);
        System.out.println("Operation success: deposit. " + "Balance: " + this.balance);
    }
}
