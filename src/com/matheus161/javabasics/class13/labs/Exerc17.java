package com.matheus161.javabasics.class13.labs;

import java.util.Scanner;

public class Exerc17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho da área a ser pintada em m^2: ");
        double area = scanner.nextDouble();

        double totalLiters = area / 6;

        double totalBuckets = Math.ceil(totalLiters / 18);
        double totalValueBuckets = totalBuckets * 80;

        double totalGallons = Math.ceil(totalLiters / 3.6);
        double totalValueGallon = totalGallons * 25;

        double litersWithMargin = totalLiters * 1.10;
        int mixedBuckets = (int) (litersWithMargin / 18);
        double remainingLiters = litersWithMargin - (mixedBuckets * 18);
        int mixedGallons = (int) Math.ceil(remainingLiters / 3.6);
        double priceMixed = (mixedBuckets * 80) + (mixedGallons * 25);

        System.out.println("Total de latas: " + totalBuckets + " no valor de R$: " + totalValueBuckets);
        System.out.println("Total de galões: " + totalGallons + " no valor de R$: " + totalValueGallon);
        System.out.println("Mistura otimizada: " + mixedBuckets + " latas e " + mixedGallons + " galões - R$ " + priceMixed);
    }
}
