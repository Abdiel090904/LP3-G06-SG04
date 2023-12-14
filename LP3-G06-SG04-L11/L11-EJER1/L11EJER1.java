package com.mycompany.l11.ejer1;
public class L11EJER1 {
    public static void main(String[] args) {
        Double a = 2.5;
        try {
            // Crear algunos Goodies
            Goodies chocolate = new Goodies("Chocolate", 2.5);
            Goodies soda = new Goodies("Soda", 1.8);
            Goodies candy = new Goodies("Candy", 3.0);

            // Crear una bolsa de golosinas
            CandyBags candyBag = new CandyBags(5);

            // Agregar golosinas a la bolsa
            candyBag.add(chocolate);
            candyBag.add(soda);
            candyBag.add(candy);

            // Intentar agregar la misma golosina nuevamente
            candyBag.add(chocolate);

            // Mostrar el contenido de la bolsa
            System.out.println("Contenido de la bolsa: " + candyBag);

            // Mostrar la golosina más económica
            Goodies cheapestGoodie = candyBag.cheapest();
            System.out.println("Golosina más económica: " + cheapestGoodie);

            // Mostrar las 2 golosinas más caras
            CandyBags expensiveGoodies = candyBag.mostExpensive(2);
            System.out.println("Golosinas más caras: " + expensiveGoodies);
        } catch (IsFullException | IsEmptyException e) {
            e.printStackTrace();
        }
    }
}

