package com.matheus161.javabasics.class36.labs.Exerc01;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome da agenda: ");
        String calendarName = scanner.nextLine();

        Contact[] contacts = new Contact[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Entre com as informações do contato " + (i+1));
            Contact contact = new Contact();

            System.out.println("Digite o nome");
            String contactName = scanner.nextLine();
            contact.setName(contactName);

            System.out.println("Digite o número");
            String phoneNumber = scanner.nextLine();
            contact.setPhoneNumber(phoneNumber);

            System.out.println("Digite o email");
            String email = scanner.nextLine();
            contact.setEmail(email);

            contacts[i] = contact;
        }

        Calendar calendar = new Calendar();
        calendar.setName(calendarName);
        calendar.setContacts(contacts);
        
        System.out.printf(calendar.getInformation());
    }
}
