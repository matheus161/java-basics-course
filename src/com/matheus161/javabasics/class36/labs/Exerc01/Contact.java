package com.matheus161.javabasics.class36.labs.Exerc01;

public class Contact {
    private String name;
    private String phoneNumber;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getInformation() {
        return "Nome = " + this.name + "; " +
                "Telefone = " + this.phoneNumber + "; " +
                "Email = " + this.email;
    }
}
