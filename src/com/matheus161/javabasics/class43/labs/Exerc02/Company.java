package com.matheus161.javabasics.class43.labs.Exerc02;

public class Company extends Taxpayer {
    private String cnpj;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public double calculateTax() {
        return this.getGrossIncome() * 0.1;
    }
}
