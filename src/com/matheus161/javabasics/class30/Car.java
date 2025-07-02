package com.matheus161.javabasics.class30;

public class Car {
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    public Car(String marca, String modelo, int numPassageiros, double capCombustivel,
               double consumoCombustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        this.capCombustivel = capCombustivel;
        this.consumoCombustivel = consumoCombustivel;
    }

    Car() {
    }

    public Car(String marca, String modelo, int numPassageiros) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        System.out.println("Chamando o construtor com 3 parâmetros");
    }

    public Car(String marca, String modelo) {
        this("Fiat", "Ducato", 10);
        System.out.println("Chamando o construtor com 2 parâmetros");
    }

    void exibirAutonomia() {
        System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + " km");
    }

    double obterAutonomia() {
        System.out.println("Método obterAutonomia foi chamado.");
        return capCombustivel * consumoCombustivel;
    }

    double calcularCombustivel(double km) {
        double qtdCombustivel = km/consumoCombustivel;

        return qtdCombustivel;
    }
}
