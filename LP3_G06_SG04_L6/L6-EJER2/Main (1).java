import java.util.ArrayList;
import java.util.Scanner;

interface ImpactoEcologico {
    double obtenerImpactoEcologico();
}

class Edificio implements ImpactoEcologico {
    private double superficie;
    private int cantidadVentanas;
    private double eficienciaEnergetica;

    public Edificio(double superficie, int cantidadVentanas, double eficienciaEnergetica) {
        this.superficie = superficie;
        this.cantidadVentanas = cantidadVentanas;
        this.eficienciaEnergetica = eficienciaEnergetica;
    }

    @Override
    public double obtenerImpactoEcologico() {
        double FACTOR_DE_EMISION = 0.5;
        double DATO_ACTIVIDAD = (superficie * 0.1) + (cantidadVentanas * 0.5) - (eficienciaEnergetica * 0.2);
        return DATO_ACTIVIDAD * FACTOR_DE_EMISION;
    }
}

class Auto implements ImpactoEcologico {
    private double potenciaMotor;
    private double peso;
    private double eficienciaCombustible;

    public Auto(double potenciaMotor, double peso, double eficienciaCombustible) {
        this.potenciaMotor = potenciaMotor;
        this.peso = peso;
        this.eficienciaCombustible = eficienciaCombustible;
    }

    @Override
    public double obtenerImpactoEcologico() {
        double FACTOR_DE_EMISION = 0.3;
        double DATO_ACTIVIDAD = (potenciaMotor * 0.2) + (peso * 0.3) - (eficienciaCombustible * 0.1);
        return DATO_ACTIVIDAD * FACTOR_DE_EMISION;
    }
}

class Bicicleta implements ImpactoEcologico {
    private int cantidadBicicletas;

    public Bicicleta(int cantidadBicicletas) {
        this.cantidadBicicletas = cantidadBicicletas;
    }

    @Override
    public double obtenerImpactoEcologico() {
        double FACTOR_DE_EMISION = 0.05;
        double DATO_ACTIVIDAD = cantidadBicicletas * 1.0;
        return DATO_ACTIVIDAD * FACTOR_DE_EMISION;
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double superficie, eficienciaEnergetica, potenciaMotor, peso, eficienciaCombustible;
        int cantidadVentanas, cantidadBicicletas;

        System.out.println("Bienvenido al sistema de cálculo de impacto ecológico");

        while (true) {
            System.out.println("\n\t________MENU_______");
            System.out.println("1. Ingresar datos para un edificio");
            System.out.println("2. Ingresar datos para un auto");
            System.out.println("3. Ingresar datos para una bicicleta");
            System.out.println("4. Salir");
            System.out.println("Elija una opción:  ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese la superficie del edificio en metros cuadrados:");
                    superficie = scanner.nextDouble();
                    System.out.println("Ingrese la cantidad de ventanas del edificio:");
                    cantidadVentanas = scanner.nextInt();
                    System.out.println("Ingrese la eficiencia energética del edificio:");
                    eficienciaEnergetica = scanner.nextDouble();

                    Edificio edificio = new Edificio(superficie, cantidadVentanas, eficienciaEnergetica);
                    double impactoEcologicoEdificio = edificio.obtenerImpactoEcologico();
                    String identificacionEdificio = obtenerIdentificacion(edificio);
                    System.out.println(identificacionEdificio + " - Impacto ecológico: " + impactoEcologicoEdificio + " GEI");
                    break;

                case 2:
                    System.out.println("Ingrese la potencia del motor del auto:");
                    potenciaMotor = scanner.nextDouble();
                    System.out.println("Ingrese el peso del auto:");
                    peso = scanner.nextDouble();
                    System.out.println("Ingrese la eficiencia del combustible del auto:");
                    eficienciaCombustible = scanner.nextDouble();

                    Auto auto = new Auto(potenciaMotor, peso, eficienciaCombustible);
                    double impactoEcologicoAuto = auto.obtenerImpactoEcologico();
                    String identificacionAuto = obtenerIdentificacion(auto);
                    System.out.println(identificacionAuto + " - Impacto ecológico: " + impactoEcologicoAuto + " GEI");
                    break;

                case 3:
                    System.out.println("Ingrese la cantidad de bicicletas:");
                    cantidadBicicletas = scanner.nextInt();

                    Bicicleta bicicleta = new Bicicleta(cantidadBicicletas);
                    double impactoEcologicoBicicleta = bicicleta.obtenerImpactoEcologico();
                    String identificacionBicicleta = obtenerIdentificacion(bicicleta);
                    System.out.println(identificacionBicicleta + " - Impacto ecológico: " + impactoEcologicoBicicleta + " GEI");
                    break;

                case 4:
                    System.out.println("Saliendo del programa...");
                    return;

                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        }
    }

    public static String obtenerIdentificacion(ImpactoEcologico objeto) {
        if (objeto instanceof Edificio) {
            return "Edificio";
        } else if (objeto instanceof Auto) {
            return "Auto";
        } else if (objeto instanceof Bicicleta) {
            return "Bicicleta";
        } else {
            return "Error";
        }
    }
}
