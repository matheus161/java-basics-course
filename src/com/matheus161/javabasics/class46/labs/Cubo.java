package com.matheus161.javabasics.class46.labs;

public class Cubo extends Figura3D {

    private int lado;

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return 6 * Math.pow(lado, 2);
    }

    @Override
    public double calcularVolume() {
        return Math.pow(lado, 3);
    }
}
