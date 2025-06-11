package com.matheus161.javabasics.class13.labs;

import java.util.Scanner;

public class Exerc16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho da área a ser pintada em m^2: ");
        double area = scanner.nextDouble();

        double totalLiters = area / 3;
        double totalBuckets = Math.ceil(totalLiters / 18);
        double value = totalBuckets * 80;
        System.out.print("Total de latas: " + totalBuckets + " no valor de R$: " + value);
    }
}
