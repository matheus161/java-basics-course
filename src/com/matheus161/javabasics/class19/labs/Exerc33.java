package com.matheus161.javabasics.class19.labs;

import java.util.Random;

public class Exerc33 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] vector = new int[10];

        for (int i = 0; i < 10; i++)  {
            vector[i] = random.nextInt(10) + 1;
        }

        boolean primo;
        String msg;

        for (int i = 0; i < 10; i++)  {
            vector[i] = random.nextInt(10) + 1;
            primo = true;
            for (int j = 2; j < vector[i]; j++) {
                if(vector[i] % j == 0) {
                    primo = false;
                    break;
                }
            }
            if (primo) {
                msg = " é primo";
            } else {
                msg = " não é primo";
            }
            System.out.println(vector[i] + msg);
        }
    }
}
