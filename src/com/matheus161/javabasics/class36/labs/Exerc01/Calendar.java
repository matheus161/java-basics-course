package com.matheus161.javabasics.class36.labs.Exerc01;

public class Calendar {
    private String name;
    private Contact[] contacts;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Contact[] getContacts() {
        return contacts;
    }

    public void setContacts(Contact[] contacts) {
        this.contacts = contacts;
    }

    public String getInformation() {
        String info = "Nome = " + this.name + "\n";

        if (this.contacts != null) {
            for (Contact c : contacts) {
                info += c.getInformation() + "\n";
            }
        }

        return info;
    }
}
