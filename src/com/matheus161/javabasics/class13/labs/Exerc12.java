package com.matheus161.javabasics.class13.labs;

import java.util.Scanner;

public class Exerc12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite sua altura: ");
        double height = scanner.nextDouble();
        double idealWeight = 72.7 * height - 58;

        System.out.print("Peso ideal: " + idealWeight);
    }
}
