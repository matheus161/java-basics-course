package com.matheus161.javabasics.class25;

public class CarExample {
    public static void main(String[] args) {
        Car van = new Car();
        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numPassageiros = 10;
        van.capCombustivel = 100;
        van.consumoCombustivel = 0.2;

        System.out.println(van.marca);
        System.out.println(van.modelo);

        van.exibirAutonomia();

        double autonomia = van.obterAutonomia();
        System.out.println("A autonomia do carro é: " + autonomia);
        System.out.println("A autonomia do carro é: " + van.obterAutonomia());

        double qtdCombustivel = van.calcularCombustivel(10);
        System.out.println("Quantidade de combustível necessária " + qtdCombustivel);
    }
}
