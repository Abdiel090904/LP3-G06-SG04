import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion, n = 0;
        Figura[] f = new Figura[50];

        do {
            System.out.println("\nMenú");
            System.out.println("1-.Círculo");
            System.out.println("2-.Cuadrado");
            System.out.println("3-.Triángulo");
            System.out.println("4-.Esfera");
            System.out.println("5-.Cubo");
            System.out.println("6-.Tetraedro");
            System.out.println("7-.Mostrar todas las figuras");
            System.out.println("8-.Salir");
            System.out.print("Elige una opción: ");
            opcion = sn.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el radio: ");
                    double radio = sn.nextDouble();
                    System.out.println("Ingrese el color: ");
                    sn.nextLine(); 
                    String color = sn.nextLine();
                    f[n] = new Circulo(radio, color);
                    break;
                case 2:
                    System.out.println("Ingrese el lado: ");
                    double lado = sn.nextDouble();
                    f[n] = new Cuadrado(lado);
                    break;
                case 3:
                    System.out.println("Ingrese la base: ");
                    double b = sn.nextDouble();
                    System.out.println("Ingrese la altura: ");
                    double h = sn.nextDouble();
                    f[n] = new Triangulo(b, h);
                    break;
                case 4:
                    System.out.println("Ingrese el radio: ");
                    double radi = sn.nextDouble();
                    f[n] = new Esfera(radi);
                    break;
                case 5:
                    System.out.println("Ingrese el lado: ");
                    double lad = sn.nextDouble();
                    f[n] = new Cubo(lad);
                    break;
                case 6:
                    System.out.println("Ingrese la arista: ");
                    double arista = sn.nextDouble();
                    System.out.println("Ingrese la aplicación: ");
                    sn.nextLine();  
                    String aplicacion = sn.nextLine();
                    f[n] = new Tetraedro(arista, aplicacion);
                    break;
                case 7:
                    System.out.println();
                    for (int i = 0; i < n; i++) {
                        if (f[i] != null) {
                            String tipo = "";
                            if (f[i] instanceof Circulo) {
                                tipo = "Círculo";
                                String col = ((Circulo) f[i]).obtenerColor();
                                System.out.println("Tipo de figura: " + tipo);
                                System.out.println(col);
                            } else if (f[i] instanceof Cuadrado) {
                                tipo = "Cuadrado";
                            } else if (f[i] instanceof Triangulo) {
                                tipo = "Triángulo";
                            } else if (f[i] instanceof Esfera) {
                                tipo = "Esfera";
                            } else if (f[i] instanceof Cubo) {
                                tipo = "Cubo";
                            } else if (f[i] instanceof Tetraedro) {
                                tipo = "Tetraedro";
                                String app = ((Tetraedro) f[i]).obtenerAplicacion();
                                System.out.println("Tipo de figura: " + tipo);
                                System.out.println(app);
                            }

                            System.out.println("Área: " + f[i].obtenerArea());
                            if (f[i] instanceof FiguraTridimensional) {
                                System.out.println("Volumen: " + ((FiguraTridimensional) f[i]).obtenerVolumen());
                            }
                            System.out.println();
                        }
                    }
                    System.out.println();
                    break;
                case 8:
                    salir = true;
                    break;
            }
            n++;
        } while (!salir);
    }
}
