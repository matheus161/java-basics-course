package com.matheus161.javabasics.class13.labs;

import java.util.Scanner;

public class Exerc04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite as quatro notas do bimestre: ");
        int val1 = scanner.nextInt();
        int val2 = scanner.nextInt();
        int val3 = scanner.nextInt();
        int val4 = scanner.nextInt();
        int average = (val1 + val2 + val3 + val4) / 4;

        System.out.println("Média do bimestre: " + average);
    }
}
