package com.matheus161.javabasics.class25.labs.Exerc02;

public class Exerc02 {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();

        bankAccount.status = BankAccount.AccountType.ESPECIAL;
        bankAccount.number = "010101";
        bankAccount.limit = 12500.00;

        System.out.println("Account status: " + bankAccount.getStatus());
        bankAccount.withdraw(10000);
        bankAccount.getBalance();
        bankAccount.deposit(500);
        bankAccount.getBalance();
        bankAccount.withdraw(3000);
        bankAccount.getBalance();
        bankAccount.withdraw(1000);
        bankAccount.getBalance();
    }
}
