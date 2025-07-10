package com.matheus161.javabasics.class41;

public class Test {
    public static void main(String[] args) {
        // Person person = new Person();
        Person student = new Student();
        Person professor = new Professor();

        // person.setAddress("Rua 1, num 1");
        student.setAddress("Rua 2, num 2");
        professor.setAddress("Rua 3, num 3");

        // System.out.println(person.obterEtiquetaEndereco());
        // System.out.println(student.obterEtiquetaEndereco());
        // System.out.println(professor.obterEtiquetaEndereco());

        // Call abstract classes
        student.imprimirEtiquetaEndereco();
        professor.imprimirEtiquetaEndereco();
    }
}
