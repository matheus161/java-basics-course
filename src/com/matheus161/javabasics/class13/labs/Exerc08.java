package com.matheus161.javabasics.class13.labs;

import java.util.Scanner;

public class Exerc08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quanto você ganha por hora e o número de horas trabalhadas? ");
        double salaryPerHour = scanner.nextDouble();
        int hours = scanner.nextInt();
        double monthlySalary = salaryPerHour * hours;

        System.out.println("Salário mensal: " + monthlySalary);
    }
}
