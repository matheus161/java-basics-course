package com.matheus161.javabasics.class43.labs.Exerc01;

public class Test {
    public static void main(String[] args) {

        System.out.println("*** Bank Account ***");
        BankAccount bankAccount = new BankAccount("Simple BankAccount",
                "1234", 100);

        System.out.println(bankAccount);

        bankAccount.deposit(100);
        bankAccount.withdraw(150);
        bankAccount.withdraw(60);

        System.out.println("\n");
        System.out.println("*** Savings Account ***");
        SavingsAccount savingsAccount = new SavingsAccount("Simple BankAccount",
                "1234", 100, 14);

        savingsAccount.updateBalance(0.5);
        savingsAccount.withdraw(200);

        System.out.println("\n");
        System.out.println("*** Special Account ***");
        SpecialAccount specialAccount = new SpecialAccount("Simple BankAccount",
                "1234", 100, 50);

        specialAccount.withdraw(50);
        specialAccount.withdraw(70);
        specialAccount.withdraw(80);

    }
}
