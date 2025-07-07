package com.matheus161.javabasics.class35.labs.Exerc01;

public class Fibonacci {
    public static int calculate(int n) {
        if (n < 2) {
            return 1;
        }

        return calculate(n-1) + calculate(n-2);
    }
}
