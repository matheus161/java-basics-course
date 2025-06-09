package com.matheus161.javabasics.class11;

public class Curiosity {
    public static void main (String[] args) {
        int var1 = 2147483647;
        int var2 = 1;

        // De -2147483648 até 2147483647
        // Caso exceda o limite, ele volta para os números negativos, como se fosse uma roleta

        System.out.println(var1 + var2);
    }
}
