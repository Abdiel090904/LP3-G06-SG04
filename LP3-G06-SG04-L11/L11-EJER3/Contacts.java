package com.mycompany.l11.ejer3;
import java.util.Scanner;
class Contacts {
    private Dictionary<String, String> contactDictionary = new Dictionary<>();

    public void addContact(String dni, String contactData) {
        contactDictionary.add(dni, contactData);
    }

    public boolean deleteContact(String dni) {
        return contactDictionary.delete(dni);
    }

    public String getContactData(String dni) {
        try {
            return contactDictionary.getValue(dni);
        } catch (ObjectNoExistException e) {
            return "Contact not found.";
        }
    }

    public void displayAllContacts() {
        System.out.println(contactDictionary.toStringO());
    }
}
