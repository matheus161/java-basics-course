package com.matheus161.javabasics.class36;

public class Contact {
    private String name;
    private Address address;
    private PhoneNumber[] numbers;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public PhoneNumber[] getNumber() {
        return numbers;
    }

    public void setNumber(PhoneNumber[] number) {
        this.numbers = number;
    }
}
