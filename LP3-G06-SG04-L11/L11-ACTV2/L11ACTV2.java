package com.mycompany.l11.actv2;
public class L11ACTV2 {
    public static void main(String[] args) {
        // Crear pares ordenados de diferentes tipos
        OrderedPair<Integer, Integer> pair1 = new OrderedPair<>(1, 100);
        OrderedPair<Integer, String> pair2 = new OrderedPair<>(2, "Hello");
        OrderedPair<String, Persona> pair3 = new OrderedPair<>("Alice", new Persona("Alice", "Address", "123456"));

        // Imprimir los pares ordenados
        System.out.println(pair1.toString()); // Imprime "(1, 100)"
        System.out.println(pair2.toString()); // Imprime "(2, Hello)"
        System.out.println(pair3.toString()); // Imprime "(Alice, Persona@hashcode)"
    }
}


