package com.matheus161.javabasics.class19;

public class Arrays {
    public static void main(String[] args) {
        double[] temp = new double[365];
        temp[0] = 31.3;
        temp[1] = 32.0;
        temp[2] = 33.2;

        for (int i=0; i < temp.length; i++) {
            System.out.println("O valor da temperatura do dia " + (i + 1) + " é: " + temp[i]);
        }

        // Better for
        for (double item : temp) {
            System.out.println(item);
        }
    }
}
