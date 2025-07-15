package com.matheus161.javabasics.class43.labs.Exerc01;

import java.util.Calendar;

public class SavingsAccount extends BankAccount {
    private int incomeDay;


    public SavingsAccount(String clientName, String accountNumber, double balance, int incomeDay) {
        super(clientName, accountNumber, balance);
        this.incomeDay = incomeDay;
    }

    public int getIncomeDay() {
        return incomeDay;
    }

    public void setIncomeDay(int incomeDay) {
        this.incomeDay = incomeDay;
    }

    @Override
    public String toString() {
        return "Income day: '" + incomeDay + '\'' + "\n" +
                super.toString();
    }

    public void updateBalance(double fees) {
        Calendar today = Calendar.getInstance();

        if (incomeDay == today.get(Calendar.DAY_OF_MONTH)) {
            this.setBalance(this.getBalance() + (this.getBalance() * fees));
            System.out.println("Operation success: update balance. " + "Balance: " + this.getBalance());
        } else {
            System.out.println("Operation denied: wrong income day. "  + "Balance: " + this.getBalance());
        }

    }
}
