package com.matheus161.javabasics.class13.labs;

import java.util.Scanner;

public class Exerc06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o raio do círculo: ");
        int radius = scanner.nextInt();

        double area = Math.pow(radius, 2) * 3.14;
        System.out.println("A área do circulo é: " + area);
    }
}
