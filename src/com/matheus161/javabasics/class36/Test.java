package com.matheus161.javabasics.class36;

public class Test {
    public static void main(String[] args) {
        Contact contact = new Contact();
        contact.setName("Matheus");
        // contact.setAddress("Street A");
        // contact.setNumber("(79)99999-8888");

        // Relacionamento tem um endereço
        Address address = new Address();
        address.setStreet("Rua A");
        address.setNumber("n/a");
        address.setComplement("-");
        address.setCity("Aracaju");
        address.setState("Sergipe");
        address.setZipcode("9999999");

        contact.setAddress(address);

        // Relacionamento tem um telefone
        PhoneNumber phoneNumber = new PhoneNumber();
        phoneNumber.setType("cellphone");
        phoneNumber.setDDD("79");
        phoneNumber.setNumber("99999-8888");

        PhoneNumber phoneNumber2 = new PhoneNumber();
        phoneNumber2.setType("home");
        phoneNumber2.setDDD("79");
        phoneNumber2.setNumber("3555-5555");

        PhoneNumber[] phoneNumbers = new PhoneNumber[2];
        phoneNumbers[0] = phoneNumber;
        phoneNumbers[1] = phoneNumber2;

        contact.setNumber(phoneNumbers);

        System.out.println(contact.getName());

        if (contact.getAddress() != null){
            System.out.println(contact.getAddress().getCity());
        }

        /*if (contact.getNumber() != null){
            System.out.println(contact.getNumber().getDDD() +
                    " " + contact.getNumber().getNumber());
        }*/

        if (contact.getNumber() != null){
            for (PhoneNumber p : contact.getNumber()) {
                System.out.println(p.getDDD() +
                        " " + p.getNumber());
            }
        }
    }
}
