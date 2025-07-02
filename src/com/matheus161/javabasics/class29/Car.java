package com.matheus161.javabasics.class29;

public class Car {
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    Car() {
        System.out.println("Class Car was created. ");
        numPassageiros = 4;
    }

    Car(String marca_, String modelo_, int numPassageiros_, double capCombustivel_, double consumoCombustivel_) {
        marca = marca_;
        modelo = modelo_;
        numPassageiros = numPassageiros_;
        capCombustivel = capCombustivel_;
        consumoCombustivel = consumoCombustivel_;
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
