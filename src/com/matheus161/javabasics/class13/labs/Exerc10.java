package com.matheus161.javabasics.class13.labs;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exerc10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a temperatura em Celsius: ");
        double temperatureCelsius = scanner.nextDouble();
        /**
         * C = (5 * (F-32) / 9)
         * F = (9C/5) + 32
         * */
        double convertedToFarenheit = (9 * temperatureCelsius / 5) + 32;

        DecimalFormat formater = new DecimalFormat("0.0");
        String formatedTemp = formater.format(convertedToFarenheit);
        System.out.print("Temperatura convertida para Celsius: " + formatedTemp);
    }
}
