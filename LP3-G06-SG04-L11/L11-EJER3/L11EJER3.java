package com.mycompany.l11.ejer3;

public class L11EJER3 {
    public static void main(String[] args) {
        // Ejemplo de uso de Dictionary y Pair
        Dictionary<Integer, String> myDictionary = new Dictionary<>();
        myDictionary.add(1, "One");
        myDictionary.add(2, "Two");
        myDictionary.add(3, "Three");

        System.out.println("Dictionary Contents:");
        System.out.println(myDictionary.toStringO());

        try {
            System.out.println("Value for key 2: " + myDictionary.getValue(2));
        } catch (ObjectNoExistException e) {
            System.out.println("Key not found.");
        }

        // Ejemplo de uso de Contacts
        Contacts myContacts = new Contacts();
        myContacts.addContact("123456", "John Doe");
        myContacts.addContact("789012", "Jane Smith");
        myContacts.addContact("345678", "Bob Johnson");

        System.out.println("\nAll Contacts:");
        myContacts.displayAllContacts();

        System.out.println("\nContact data for DNI 789012: " + myContacts.getContactData("789012"));

        myContacts.deleteContact("123456");
        System.out.println("\nAll Contacts after deletion:");
        myContacts.displayAllContacts();
    }
}
