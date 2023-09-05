/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejer1;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Usuario
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Rectangulo> rectangulos = new ArrayList<>();

        while (true) {
            System.out.println("Menú:");
            System.out.println("1. Crear un nuevo rectángulo");
            System.out.println("2. Mostrar información de todos los rectángulos");
            System.out.println("3. Calcular área y perímetro de un rectángulo");
            System.out.println("4. Mover un rectángulo");
            System.out.println("5. Salir");

            System.out.print("Ingrese su opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la base del rectángulo: ");
                    double base = scanner.nextDouble();
                    System.out.print("Ingrese la altura del rectángulo: ");
                    double altura = scanner.nextDouble();
                    Rectangulo nuevoRectangulo = new Rectangulo(base, altura);
                    rectangulos.add(nuevoRectangulo);
                    System.out.println("Rectángulo creado con éxito.");
                    break;

                case 2:
                    if (!rectangulos.isEmpty()) {
                        System.out.println("Información de todos los rectángulos:");
                        for (int i = 0; i < rectangulos.size(); i++) {
                            Rectangulo rect = rectangulos.get(i);
                            System.out.println("Rectángulo " + (i + 1) + ":");
                            System.out.println(rect);
                            System.out.println("Color: " + rect.getColor());
                        }
                    } else {
                        System.out.println("No se han creado rectángulos aún.");
                    }
                    break;

                case 3:
                    if (!rectangulos.isEmpty()) {
                        System.out.print("Ingrese el número de rectángulo para calcular (1-" + rectangulos.size() + "): ");
                        int numeroRectangulo = scanner.nextInt();
                        if (numeroRectangulo >= 1 && numeroRectangulo <= rectangulos.size()) {
                            Rectangulo rect = rectangulos.get(numeroRectangulo - 1);
                            System.out.println("Área del Rectángulo " + numeroRectangulo + ": " + Manejador.calcularArea(rect));
                            System.out.println("Perímetro del Rectángulo " + numeroRectangulo + ": " + Manejador.calcularPerimetro(rect));
                        } else {
                            System.out.println("Número de rectángulo no válido.");
                        }
                    } else {
                        System.out.println("No se han creado rectángulos aún.");
                    }
                    break;

                case 4:
                    if (!rectangulos.isEmpty()) {
                        System.out.print("Ingrese el número de rectángulo para mover (1-" + rectangulos.size() + "): ");
                        int numeroRectangulo = scanner.nextInt();
                        if (numeroRectangulo >= 1 && numeroRectangulo <= rectangulos.size()) {
                            Rectangulo rect = rectangulos.get(numeroRectangulo - 1);
                            System.out.print("Ingrese la cantidad de puntos para mover en X: ");
                            int puntosX = scanner.nextInt();
                            System.out.print("Ingrese la cantidad de puntos para mover en Y: ");
                            int puntosY = scanner.nextInt();
                            Manejador.moverX(rect, puntosX);
                            Manejador.moverY(rect, puntosY);
                            System.out.println("Rectángulo movido con éxito.");
                        } else {
                            System.out.println("Número de rectángulo no válido.");
                        }
                    } else {
                        System.out.println("No se han creado rectángulos aún.");
                    }
                    break;

                case 5:
                    System.out.println("Saliendo del programa.");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, ingrese una opción válida.");
                    break;
            }
        }
    } 
}
