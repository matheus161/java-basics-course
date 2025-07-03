package com.matheus161.javabasics.class34;

public class TestCalculator {

    static int resultSoma;

    public static void main(String[] args) {
        //Calculator calculator = new Calculator();
        //calculator.soma(1, 2);

        // You can use like this
        // Utility methods
        resultSoma = Calculator.soma(1, 2);
        Calculator.soma(1, 2);
        sum2Values(1, 2);
    }

    // This function needs to be static
    static int sum2Values(int num1, int num2){
        return Calculator.soma(num1, num2);
    }
}
