package com.matheus161.javabasics.class31;

public class Car {
    public String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    private double consumoCombustivel;

    void exibirAutonomia() {
        System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + " km");
    }

    double obterAutonomia() {
        System.out.println("Método obterAutonomia foi chamado.");
        return capCombustivel * consumoCombustivel;
    }

    private double divideKMPorConsumoCombustive(double km){
        return km/this.consumoCombustivel;
    }

    double calcularCombustivel(double km) {
        return this.divideKMPorConsumoCombustive(km);
    }
}
