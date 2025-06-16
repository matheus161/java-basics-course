package com.matheus161.javabasics.class19.labs;

import java.util.Random;

public class Exerc32 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[5];

        for (int i = 0; i < 5; i++) {
            array[i] = random.nextInt(10) + 1;
        }

        for (int i = 0; i < 5; i++) {
            int element = array[i];
            System.out.println("Tabuada de " + element);
            for (int j = 0; j < 10; j++) {
                int value = (j+1) * element;
                System.out.println(element + " x " + (j+1) + " = " + value);
            }
            System.out.println();
        }
    }
}
