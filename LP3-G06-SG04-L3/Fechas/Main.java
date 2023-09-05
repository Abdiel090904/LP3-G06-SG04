/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJERCICIOS;

import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fecha fecha = new Fecha();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nMenú de Operaciones:");
            System.out.println("1. Mostrar fecha actual");
            System.out.println("2. Leer una nueva fecha");
            System.out.println("3. Calcular si el año es bisiesto");
            System.out.println("4. Mostrar número de días en el mes ingresado");
            System.out.println("5. Mostrar fecha en formato corto");
            System.out.println("6. Calcular días transcurridos desde el 1-1-1900");
            System.out.println("7. Calcular día de la semana");
            System.out.println("8. Mostrar fecha en formato largo");
            System.out.println("9. Avanzar fecha por un número de días");
            System.out.println("10. Calcular días entre dos fechas");
            System.out.println("11. Mostrar fecha siguiente");
            System.out.println("12. Mostrar fecha anterior");
            System.out.println("13. Copiar fecha actual");
            System.out.println("14. Comparar dos fechas");
            System.out.println("0. Salir");
            System.out.print("Elija una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\nFecha actual:");
                    fecha.mostrarFecha();
                    break;
                case 2:
                    fecha.leerFecha();
                    break;
                case 3:
                    System.out.println("\n¿El año es bisiesto? " + (fecha.bisiesto() ? "Sí" : "No"));
                    break;
                case 4:
                    System.out.print("\nIngrese el mes (1-12): ");
                    int mes = scanner.nextInt();
                    System.out.println("Número de días en el mes ingresado: " + fecha.diasMes(mes));
                    break;
                case 5:
                    System.out.println("\nFecha en formato corto:");
                    fecha.corta();
                    break;
                case 6:
                    System.out.println("\nDías transcurridos desde el 1-1-1900: " + fecha.diasTranscurridos());
                    break;
                case 7:
                    System.out.println("\nDía de la semana: " + fecha.diaSemana());
                    break;
                case 8:
                    System.out.println("\nFecha en formato largo:");
                    fecha.larga();
                    break;
                case 9:
                    System.out.print("\nIngrese el número de días para avanzar la fecha: ");
                    long dias = scanner.nextLong();
                    fecha.fechaTras(dias);
                    System.out.println("Fecha después de " + dias + " días:");
                    fecha.mostrarFecha();
                    break;
                case 10:
                    Fecha otraFecha = new Fecha();
                    otraFecha.leerFecha();
                    int diasEntre = fecha.diasEntre(otraFecha);
                    System.out.println("\nNúmero de días entre las dos fechas: " + diasEntre);
                    break;
                case 11:
                    fecha.siguiente();
                    System.out.println("\nFecha siguiente:");
                    fecha.mostrarFecha();
                    break;
                case 12:
                    fecha.anterior();
                    System.out.println("\nFecha anterior:");
                    fecha.mostrarFecha();
                    break;
                case 13:
                    Fecha copiaFecha = fecha.copia();
                    System.out.println("\nCopia de la fecha actual:");
                    copiaFecha.mostrarFecha();
                    break;
                case 14:
                    Fecha fecha2 = new Fecha();
                    fecha2.leerFecha();
                    if (Fecha.igualQue(fecha, fecha2)) {
                        System.out.println("\nLas dos fechas son iguales.");
                    } else if (Fecha.menorQue(fecha, fecha2)) {
                        System.out.println("\nLa primera fecha es menor que la segunda fecha.");
                    } else {
                        System.out.println("\nLa primera fecha es mayor que la segunda fecha.");
                    }
                    break;
                case 0:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elija una opción válida.");
                    break;
            }
        } while (opcion != 0);

        scanner.close();
    }
    
}
