package com.matheus161.javabasics.class13.labs;

import java.util.Scanner;

public class Exerc15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Valor em R$ da hora de trabalho: ");
        double valuePerHour = scanner.nextDouble();

        System.out.print("Valor de horas trabalhadas no mês: ");
        int hours = scanner.nextInt();

        double initialMonthSalary = valuePerHour * hours;
        double INSSTax = initialMonthSalary * 0.08;
        double laborUnionTax = initialMonthSalary * 0.05;
        double incomeTax = initialMonthSalary * 0.11;
        double taxesSum = INSSTax + laborUnionTax + incomeTax;
        double laborUnionValue = initialMonthSalary - laborUnionTax;
        double finalMonthSalary = laborUnionValue - taxesSum;

        System.out.println("Salário Bruto: R$" + initialMonthSalary);
        System.out.println("IR (11%): R$" + incomeTax);
        System.out.println("INSS (8%): R$" + INSSTax);
        System.out.println("Sindicato (5%): R$" + laborUnionTax);
        System.out.println("Salário Liquído: R$" + finalMonthSalary);
    }
}
