package com.matheus161.javabasics.class19.labs;

import java.util.Random;

public class Exerc35 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] vector = new int[10];

        for (int i = 0; i < vector.length; i++) {
            vector[i] = random.nextInt(100) + 1;
        }

        for (int i = 0; i < vector.length; i++) {
            System.out.println("Divisores de " + vector[i] + ":");
            for (int j = 1; j <= vector[i]; j++) {
                if (vector[i] % j  == 0) {
                    System.out.println(j);
                }
            }
            System.out.println();
        }
    }
}
