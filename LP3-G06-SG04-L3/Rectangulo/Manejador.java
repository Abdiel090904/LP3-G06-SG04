/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejer1;

/**
 *
 * @author Usuario
 */
public class Manejador {
    public static double calcularArea(Rectangulo rectangulo) {
        return rectangulo.calcularArea();
    }

    public static double calcularPerimetro(Rectangulo rectangulo) {
        return rectangulo.calcularPerimetro();
    }

    public static void moverX(Rectangulo rectangulo, int puntos) {
        Coordenada esquina1 = rectangulo.getEsquina1();
        Coordenada esquina2 = rectangulo.getEsquina2();

        esquina1.setX(esquina1.getX() + puntos);
        esquina2.setX(esquina2.getX() + puntos);
    }

    public static void moverY(Rectangulo rectangulo, int puntos) {
        Coordenada esquina1 = rectangulo.getEsquina1();
        Coordenada esquina2 = rectangulo.getEsquina2();

        esquina1.setY(esquina1.getY() + puntos);
        esquina2.setY(esquina2.getY() + puntos);
    }
}
