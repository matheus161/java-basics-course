package com.matheus161.javabasics.class35;

public class Calculator {
    public static int nonRecursiveFactorial(int num) {
        if (num == 0){
            return 1;
        }

        int total = 1;
        for (int i=num; i>1; i--){
            total *= i;
        }

        return total;
    }

    //fatorial(5) = 5 * fatorial(4)
    //fatorial(4) = 4 * fatorial(3)
    //fatorial(3) = 3 * fatorial(2)
    //fatorial(2) = 2 * fatorial(1)
    //fatorial(1) = 1 * fatorial(0)
    //fatorial(0) = 1;
    public static int factorial(int num){

        if (num == 0){
            return 1;
        }

        return num * factorial(num-1);
    }

}
