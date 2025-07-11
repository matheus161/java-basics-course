package com.matheus161.javabasics.class42;

public class Student {
    private String className;
    private double[] grades;

    public void verifyVisibility() {
    }

    public Student() {
        super();
    }

    public Student(String name, String address, String phoneNumber, String CPF, String className, double[] grades) {
        // super(name, address, phoneNumber, CPF);
        this.className = className;
        this.grades = grades;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public double[] getGrades() {
        return grades;
    }

    public void setGrades(double[] grades) {
        this.grades = grades;
    }

    public double calculateAverage() {
        return 0;
    }

    public boolean verifyApproved() {
        return true;
    }

    public void anyMethod() {
        // super.getAddress();
        // this.setCPF("123123");
    }

    public String obterEtiquetaEndereco(){
        String s = "Endereço do Aluno: ";
        // s += super.getAddress();

        return s;
    }

    //@Override
    public void imprimirEtiquetaEndereco() {
        System.out.println(this.obterEtiquetaEndereco());
    }
}
