package com.matheus161.javabasics.class34.labs.Exerc02;

public class Main {
    static void printResult(String type, double value) {
        System.out.println(type + " = " + value);
    }

    public static void main(String[] args) {
        printResult("Sum", Calculator.sum(10.5, 50.5));
        printResult("Subtract", Calculator.subtract(12.5, 2.5));
        printResult("Multiply", Calculator.multiply(2.5, 2));
        printResult("Divide", Calculator.divide(4, 2));
        printResult("Subtract", Calculator.subtract(2.5, 0.5));
        printResult("Square", Calculator.square(6, 3));
        printResult("Factorial", Calculator.factorial(5));
    }
}
