package com.matheus161.javabasics.class52;

public class NotExactDivision extends Exception {
    private int num;
    private int dem;

    public NotExactDivision(int num, int dem) {
        super();
        this.num = num;
        this.dem = dem;
    }

    @Override
    public String toString() {
        return "Resultado de " + num + "/" + dem + " não é um inteiro!";
    }
}
