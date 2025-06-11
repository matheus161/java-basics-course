package com.matheus161.javabasics.class13.labs;

import java.util.Scanner;

public class Exerc03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite dois números: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        System.out.println("Soma dos dois números: " + (num1 + num2));
    }
}
