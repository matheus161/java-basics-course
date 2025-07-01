package com.matheus161.javabasics.class25.labs.Exerc02;

public class BankAccount {
    public enum AccountType {
        ESPECIAL,
        NOT_ESPECIAL
    }

    String number;
    AccountType status;
    double limit;

    public boolean withdraw(double value) {
        boolean hasLimit = value <= limit;

        if (hasLimit) {
            limit -= value;
        }

        printWithdrawStatus(hasLimit);
        return hasLimit;
    }

    public void printWithdrawStatus(boolean result) {
        if (result) {
            System.out.println("Withdraw with success.");
        } else {
            System.out.println("Withdraw denied: insufficient limit.");
        }
    }

    public void getBalance() {
        System.out.println("Account balance is: " + limit);
    }

    public String getStatus() {
        return status == AccountType.ESPECIAL ? "Especial" : "Não especial";
    }

    public void deposit(double value) {
        System.out.println("Account deposit: " + value);
        limit += value;
    }
}
