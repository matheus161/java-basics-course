package com.matheus161.javabasics.class13.labs;

import java.util.Scanner;

public class Exerc11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite dois números inteiros e um número real: ");
        int num1 = scanner.nextInt();
        float num2 = scanner.nextInt();
        double num3 = scanner.nextDouble();

        double result1 = (num1 * 2) * (num2 / 2);
        double result2 = (num1 * 3) + num3;
        double result3 = Math.pow(num3, 3);

        System.out.println("O produto do dobro do primeiro com metade do segundo: " + result1);
        System.out.println("A soma do triplo do primeiro com o terceiro: " + result2);
        System.out.println("O terceiro elevado ao cubo: " + result3);
    }
}
