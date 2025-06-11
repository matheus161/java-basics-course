package com.matheus161.javabasics.class13.labs;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exerc09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a temperatura em Farenheit: ");
        double temperatureFarenheit = scanner.nextDouble();
        double convertedToCelsius = (5 * (temperatureFarenheit - 32) / 9);

        DecimalFormat formater = new DecimalFormat("0.0");
        String formatedTemp = formater.format(convertedToCelsius);
        System.out.print("Temperatura convertida para Celsius: " + formatedTemp);
    }
}
