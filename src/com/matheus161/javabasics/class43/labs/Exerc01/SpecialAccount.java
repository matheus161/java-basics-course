package com.matheus161.javabasics.class43.labs.Exerc01;

public class SpecialAccount extends BankAccount {
    private double withdrawDailyLimit;

    public SpecialAccount(String clientName, String accountNumber, double balance, double withdrawDailyLimit) {
        super(clientName, accountNumber, balance);
        this.withdrawDailyLimit = withdrawDailyLimit;
    }

    public double getWithdrawDailyLimit() {
        return withdrawDailyLimit;
    }

    public void setWithdrawDailyLimit(double withdrawDailyLimit) {
        this.withdrawDailyLimit = withdrawDailyLimit;
    }

    public void withdraw(double amount) {
        double balanceWithLimit = this.getBalance() + this.withdrawDailyLimit;
        if (amount <= balanceWithLimit) {
            super.setBalance(super.getBalance() - amount);
            System.out.println("Operation success: withdraw. " + "Balance: " + this.getBalance());
        } else {
            System.out.println("Operation denied: withdraw daily limit. " + "Balance: " + this.getBalance());
        }
    }
}
