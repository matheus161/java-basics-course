package com.matheus161.javabasics.class45;

public class Test {
    public static void main(String[] args) {
        /* Student student = new Student();
        Person personStudent = student; // upcasting

        Person student2 = (Person) new Student(); // upcasting

        Person person2 = new Person();
        Student student3 = (Student) person2; */

        Person person = new Person();
        Student student = new Student();
        Professor professor = new Professor();

        if (person instanceof Person){
            System.out.println("é do tipo Pessoa");
        }

        if (student instanceof Student){
            System.out.println("é do tipo Aluno");
        }

        if (professor instanceof Professor){
            System.out.println("é do tipo Professor");
        }
    }
}
