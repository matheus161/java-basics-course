package com.matheus161.javabasics.class13;

public class ArithmeticOperators {
    public static void main(String[] args) {
        int resultado = 1 + 2;
        System.out.println(resultado);

        resultado = resultado - 1;
        System.out.println(resultado);

        resultado = resultado * 2;
        System.out.println(resultado);

        resultado = resultado / 2;
        System.out.println(resultado);

        resultado = resultado + 8;
        System.out.println(resultado);

        resultado = resultado % 7;
        System.out.println(resultado);

        // Also use '+' to concat string
        String primeiroNome = "Esta é";
        String segundoNome = " uma String concatenada.";
        String terceiroNome = primeiroNome + segundoNome;
        System.out.println(terceiroNome);

        resultado = resultado + 1;
        System.out.println(resultado);

        resultado++;
        System.out.println(resultado);

        // 5
        System.out.println(resultado++);
        // same thing as:
        // System.out.println(resultado);
        // resultado = resultado + 1;
        // resultado += 1;

        System.out.println(++resultado);
        // same thing as:
        // resultado += 1;
        // System.out.println(resultado);

        // 6
        resultado--;
        System.out.println(resultado);

        // 6
        System.out.println(resultado--);

        // 4
        System.out.println(--resultado);
    }
}
