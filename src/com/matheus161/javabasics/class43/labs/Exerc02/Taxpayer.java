package com.matheus161.javabasics.class43.labs.Exerc02;

// There is no object to Taxpayer, that's why it's an abstract class
public abstract class Taxpayer {
    private String name;
    private double grossIncome;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrossIncome() {
        return grossIncome;
    }

    public void setGrossIncome(double grossIncome) {
        this.grossIncome = grossIncome;
    }

    public abstract double calculateTax();
}
