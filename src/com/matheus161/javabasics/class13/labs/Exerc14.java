package com.matheus161.javabasics.class13.labs;

import java.util.Scanner;

public class Exerc14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de peixes em KG: ");
        double kg = scanner.nextDouble();
        Boolean isOver50Kg = kg > 50;
        double extraWeight = isOver50Kg ? kg - 50 : 0;
        double tax = isOver50Kg ? extraWeight * 4 : 0;

        System.out.println("O excesso em Kg foi " + extraWeight + "Kg");
        System.out.println("A multa em reais foi R$" + tax);
    }
}
