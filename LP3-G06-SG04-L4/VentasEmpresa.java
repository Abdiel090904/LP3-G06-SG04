package com.mycompany.ventasempresa;
import java.util.Scanner;

public class VentasEmpresa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] ventas = new double[5][4];
        for (int i = 0; i < ventas.length; i++) {
            for (int j = 0; j < ventas[i].length; j++) {
                ventas[i][j] = 0.0;
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese las ventas del producto " + (i + 1) + " para cada vendedor:");
            for (int j = 0; j < 4; j++) {
                System.out.print("Vendedor " + (j + 1) + ": S/.");
                double venta = scanner.nextDouble();
                ventas[i][j] += venta;
            }
        }
        System.out.println("\nVentas totales por vendedor y por producto:");
        System.out.println("\tVendedor 1\tVendedor 2\tVendedor 3\tVendedor 4\tTotal");
        for (int i = 0; i < ventas.length; i++) {
            double totalProducto = 0.0;
            System.out.print("Producto " + (i + 1) + ":\t");
            for (int j = 0; j < ventas[i].length; j++) {
                System.out.print(ventas[i][j] + "\t\t");
                totalProducto += ventas[i][j];
            }
            System.out.println(totalProducto);
        }
        System.out.println("\nVentas totales por vendedor:");
        double[] totalVendedor = new double[4];
        for (int j = 0; j < 4; j++) {
            double total = 0.0;
            for (int i = 0; i < ventas.length; i++) {
                total += ventas[i][j];
            }
            totalVendedor[j] = total;
            System.out.println("Vendedor " + (j + 1) + ": S/." + total);
        }
        double totalGeneral = 0.0;
        for (double total : totalVendedor) {
            totalGeneral += total;
        }
        System.out.println("\nTotal general: S/." + totalGeneral);
        scanner.close();
    }
}

