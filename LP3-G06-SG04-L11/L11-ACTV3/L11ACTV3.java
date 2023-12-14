package com.mycompany.l11.actv3;

import java.util.List;

public class L11ACTV3 {
    public static void main(String[] args) {
        try {
            // Crear una bolsa
            Bag<Integer> bag = new Bag<>();

            // Agregar elementos a la bolsa
            bag.add(1);
            bag.add(2);
            bag.add(3);
            System.out.println("Contenido de la bolsa: " + bag);

            // Obtener los objetos de la bolsa
            List<Integer> objects = bag.getObjects();
            System.out.println("Objetos en la bolsa: " + objects);

            // Intentar remover un objeto existente
            int removedObject = bag.remove(2);
            System.out.println("Objeto eliminado: " + removedObject);
            System.out.println("Contenido de la bolsa después de eliminar: " + bag);

            // Intentar remover un objeto que no existe
            bag.remove(5); // Esto lanzará ObjectNoExistException

        } catch (ObjectNoExistException e) {
            System.out.println("Excepción: " + e.getMessage());
        }
    }
}

