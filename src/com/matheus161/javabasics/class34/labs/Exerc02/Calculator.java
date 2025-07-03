package com.matheus161.javabasics.class34.labs.Exerc02;

public class Calculator {
    public static double sum(double x, double y) {
        return x + y;
    }

    public static double subtract(double x, double y) {
        return x - y;
    }

    public static double multiply(double x, double y) {
        return x * y;
    }

    public static double divide(double x, double y) {
        return x * y;
    }

    public static double square(double x, double y) {
        return Math.pow(x, y);
    }

    public static int factorial(int x) {
        int factorial = 1;
        for (int i = 5; i > 0; i--) {
            factorial *= i;
        }

        return factorial;
    }
}
