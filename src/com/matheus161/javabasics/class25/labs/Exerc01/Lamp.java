package com.matheus161.javabasics.class25.labs.Exerc01;

public class Lamp {
    String model;
    String voltage;
    int power;
    String color;
    Boolean connected = false;

    void powerOn() {
        connected = true;
    }

    void powerOf() {
        connected = false;
    }

    String isConnected() {
        return connected ? "turned on" : "turned off";
    }
}
