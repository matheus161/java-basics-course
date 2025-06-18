package com.matheus161.javabasics.class20.labs;

import java.util.Random;

public class Exerc01 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] matrix = new int[4][4];
        int biggestNumber = 0;
        int row = 0;
        int column = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int number = random.nextInt(10);
                matrix[i][j] = number;
                if (number > biggestNumber) {
                    biggestNumber = number;
                    row = i;
                    column = j;
                }
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }



        System.out.println("Maior valor = " + biggestNumber);
        System.out.println("Linha = " + row + 1);
        System.out.println("Coluna = " + column + 1);
    }
}
