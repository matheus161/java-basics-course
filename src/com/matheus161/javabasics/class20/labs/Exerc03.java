package com.matheus161.javabasics.class20.labs;

import java.util.Scanner;

public class Exerc03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[3][3];
        int qtdEven = 0;
        int qtdOdd = 0;

        for (int i = 0; i < matrix.length; i++) {
            System.out.println("Digite os números da linha " + i);
            for (int j = 0; j < matrix[i].length; j++) {
                int number = scanner.nextInt();
                matrix[i][j] = number;
                if (number % 2 == 0) {
                    qtdEven++;
                } else {
                    qtdOdd++;
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Quantidade de pares: " + qtdEven);
        System.out.println("Quantidade de ímpares: " + qtdOdd);
    }
}
