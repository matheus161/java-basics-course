package com.matheus161.javabasics.class12;

import java.util.Scanner;

public class KeyboardDataRead {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read all the line
        /*System.out.println("Digite seu nome:");
        String name = scan.nextLine();
        System.out.println("Seu nome é: " + name);

        // Read only the first entry
        System.out.println("Digite seu primeiro nome:");
        String firstName = scan.next();
        System.out.println("Seu primeiro nome é: " + firstName);

        // Read an integer
        System.out.println("Digite sua idade");
        int age = scan.nextInt();
        System.out.println("Sua idade é: " + age);

        // Read a double
        System.out.println("Digite sua altura");
        double height = scan.nextDouble();
        System.out.println("A sua altura é: " + height);*/

        System.out.println("Digite o seu primeiro nome, idade, quantidade de amigos, altura e se tem pet");
        String firstName = scan.next();
        int age = scan.nextInt();
        byte friends = scan.nextByte();
        float height = scan.nextFloat();
        boolean hasPet = scan.nextBoolean();

        System.out.println("Você digitou os seguinte valores:");
        System.out.println("Primeiro nome: " + firstName);
        System.out.println("Idade: " + age);
        System.out.println("Quantidade de amigos: " + friends);
        System.out.println("Altura: " + height);
        System.out.println("Tem algum pet? " + hasPet);
    }
}
