package com.matheus161.javabasics.class13.labs;

import java.util.Scanner;

public class Exerc18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o tamanho do arquivo em MB: ");
        double fileSize = scanner.nextDouble();

        System.out.print("Digite a velocidade da sua internet em Mbps: ");
        double internet = scanner.nextDouble();

        double fileSizeMb = fileSize * 8;
        double timeInSec = fileSizeMb / internet;
        double timeInMin = timeInSec / 60;

        System.out.println("O tempo necessário será: " + timeInMin);
    }
}
