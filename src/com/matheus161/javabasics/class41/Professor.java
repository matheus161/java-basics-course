package com.matheus161.javabasics.class41;

public class Professor extends Person {
    private String salary;
    private String className;

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public double calculateSalary() {
        return 0;
    }

    // Override method
    public String obterEtiquetaEndereco(){
        String s = "Endereço do Professor: ";
        s += super.getAddress();

        return s;
    }

    @Override
    public void imprimirEtiquetaEndereco() {
        System.out.println("Imprimindo endereço do professor.");
        System.out.println(this.obterEtiquetaEndereco());
    }
}
