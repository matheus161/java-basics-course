package com.matheus161.javabasics.class29;

public class TestCar {
    public static void main(String[] args) {
        Car van = new Car();
        van.marca = "Fiat";
        van.modelo = "Ducato";
        // van.numPassageiros = 10;
        van.capCombustivel = 100;
        van.consumoCombustivel = 0.2;

        System.out.println("Class Car was created. ");

        Car van2 = new Car("Fiat", "Ducato", 10, 100, 0.2);
        System.out.println(van2.marca);
        System.out.println(van2.modelo);
        System.out.println(van2.numPassageiros);
        System.out.println(van2.capCombustivel);
        System.out.println(van2.consumoCombustivel);
    }
}
