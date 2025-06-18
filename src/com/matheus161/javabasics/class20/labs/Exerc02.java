package com.matheus161.javabasics.class20.labs;

import java.util.Random;

public class Exerc02 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] matrix = new int[10][10];
        int biggestNumberLine5 = 0;
        int smallestNumberLine5 = 10;
        int biggestNumberCol7 = 0;
        int smallestNumberCol7 = 10;

        // line x col
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int number = random.nextInt(10);
                matrix[i][j] = number;
                if (i == 5) {
                    if (number > biggestNumberLine5) {
                        biggestNumberLine5 = number;
                    }

                    if (number < smallestNumberLine5) {
                        smallestNumberLine5 = number;
                    }
                }
                if (j == 7) {
                    if (number > biggestNumberCol7) {
                        biggestNumberCol7 = number;
                    }

                    if (number < smallestNumberCol7) {
                        smallestNumberCol7 = number;
                    }
                }
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }



        System.out.println("Maior valor linha 5 = " + biggestNumberLine5);
        System.out.println("Menor valor linha 5 = " + smallestNumberLine5);
        System.out.println("Maior valor coluna 7 = " + biggestNumberCol7);
        System.out.println("Menor valor coluna 7 = " + smallestNumberCol7);
    }
}
