package com.matheus161.javabasics.class35.labs.Exerc02;

public class Sum {

    // 3 = 3 + sum(2)
    // 2 = 2 + sum(1)
    // 1 = 1
    public static int calculate(int num) {
        if (num == 1){
            return 1;
        }

        return num + calculate(num - 1);
    }
}
