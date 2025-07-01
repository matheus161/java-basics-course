package com.matheus161.javabasics.class25.labs.Exerc01;

public class Exerc01 {
    public static void main(String[] args) {
        Lamp lamp = new Lamp();

        lamp.powerOn();
        System.out.println("The lamp is " + lamp.isConnected());

        lamp.powerOf();
        System.out.println("The lamp is " + lamp.isConnected());
    }
}
