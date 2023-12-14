package com.mycompany.l11.ejer2;
public class L11EJER2 {
    public static void main(String[] args) {
        // Demo de CandyBags
        CandyBags candyBags = new CandyBags(5);

        try {
            candyBags.add(new Goodies("Chocolate", 2.5));
            candyBags.add(new Goodies("Soda", 1.8));
            candyBags.add(new Goodies("Candy", 3.0));
            candyBags.add(new Goodies("Gum", 0.5));
            candyBags.add(new Goodies("Lollipop", 1.2));

            System.out.println("CandyBags content: " + candyBags);
            System.out.println("Cheapest goodie: " + candyBags.cheapest());

            CandyBags mostExpensive = candyBags.mostExpensive(2);
            System.out.println("Most expensive goodies: " + mostExpensive);
        } catch (IsFullException e) {
            e.printStackTrace(); // Handle appropriately in a real application
        }

        // Demo de Dictionary
        Dictionary<String, Integer> contacts = new Dictionary<>();

        contacts.add("John", 123456789);
        contacts.add("Jane", 987654321);
        contacts.add("Bob", 456789123);

        System.out.println("\nContacts Dictionary: " + contacts);

        try {
            System.out.println("Value for John: " + contacts.getValue("John"));
            System.out.println("Value for Alice: " + contacts.getValue("Alice")); // Should throw ObjectNoExist
        } catch (ObjectNoExist e) {
            System.out.println(e.getMessage());
        }

        boolean deleted = contacts.delete("Bob");
        System.out.println("Deleted Bob: " + deleted);
        System.out.println("Contacts Dictionary after deletion: " + contacts);
    }
}
