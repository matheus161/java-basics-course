package com.matheus161.javabasics.class40;

public class Person {
    private String name;
    private String address;
    private String phoneNumber;
    private String CPF;

    protected String visibility;

    public Person() {
        super();
    }

    public Person(String name, String address, String phoneNumber, String CPF) {
        super();
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.CPF = CPF;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String obterEtiquetaEndereco(){
        return address;
    }
}
