package com.matheus161.javabasics.class43;

import java.util.Arrays;
import java.util.Objects;

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
    }

    public String obterEtiquetaEndereco(){
        String s = "Endereço do Aluno: ";
        return s;
    }

    //@Override
    public void imprimirEtiquetaEndereco() {
        System.out.println(this.obterEtiquetaEndereco());
    }

    /*public String toString() {
        String s = className + "\n";
        for (double grade: grades) {
            s += grade + " ";
        }
        return s;
    }*/

    @Override
    public String toString() {
        return "Student{" +
                "className='" + className + '\'' +
                ", grades=" + Arrays.toString(grades) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(className, student.className) && Objects.deepEquals(grades, student.grades);
    }
}
