package com.mycompany.l11.actv4;
import java.util.List;

public class L11ACTV4 {
    public static void main(String[] args) {
        try {
            // Crear una bolsa de Goodies
            Bag<Goodies> goodiesBag = new Bag<>();

            // Agregar objetos a la bolsa
            goodiesBag.add(new Soda(1, "Soda A", 2.5f, "Cola", "Regular"));
            goodiesBag.add(new Chocolates(2, "Chocolate B", 1.8f, true));
            goodiesBag.add(new Soda(3, "Soda C", 3.0f, "Lemon", "Diet"));
            goodiesBag.add(new Chocolates(4, "Chocolate D", 2.2f, false));

            // Obtener los objetos de la bolsa
            List<Goodies> objects = goodiesBag.getObjects();
            System.out.println("Objetos en la bolsa: " + objects);

            // Intentar remover un objeto existente
            Goodies removedObject = goodiesBag.remove(new Soda(3, "", 0.0f, "", ""));
            System.out.println("Objeto eliminado: " + removedObject);
            System.out.println("Contenido de la bolsa después de eliminar: " + goodiesBag);

            // Intentar remover un objeto que no existe
            goodiesBag.remove(new Soda(5, "", 0.0f, "", "")); // Esto lanzará ObjectNoExistException

        } catch (ObjectNoExistException e) {
            System.out.println("Excepción: " + e.getMessage());
        }
    }
}

