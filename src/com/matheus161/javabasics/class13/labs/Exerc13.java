package com.matheus161.javabasics.class13.labs;

import java.util.Scanner;

public class Exerc13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite sua altura, peso e sexo: ");
        double height = scanner.nextDouble();
        char gender = scanner.next().charAt(0);

        double weight = 0;
        if (gender == 'M') weight = 72.7 * height - 58;
        if (gender == 'F') weight = 62.1 * height - 44.7;

        System.out.print("Informe seu peso: ");
        double personWeight = scanner.nextDouble();

        Boolean isWeightGood = personWeight < weight;
        if (isWeightGood) {
            System.out.println("Seu peso ideal é " + weight + " e você está dentro do indicado.");
        } else {

            System.out.println("Seu peso ideal é " + weight + " e você NÃO está dentro do indicado.");
        }

    }
}
