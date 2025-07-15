package com.matheus161.javabasics.class43.labs.Exerc02;

public class Individual extends Taxpayer {
    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public double calculateTax() {
        return 0;
    }
}
