package principal;
import java.util.Scanner;

public class Diagnostico {
    Scanner cout = new Scanner (System.in);
    
    public void AptoVacunaA(Perro p1){
        int condicion = 0;
        double Temp = p1.getTemp();
        double Peso = p1.peso;
        int Edad = p1.getEdad();
        while(condicion == 0){
            if(Temp <= 40 && Temp >= 37 && Peso > 5 && Edad > 1){
                System.out.println("El perro está sano");
            }
            else{
                System.out.println("El perro está enfermo");
            }
            System.out.println("Desea cambiar la temperatura, la edad y el peso? (SI = 0 / NO = 1)");
            condicion = cout.nextInt();
            if (condicion == 0){
                System.out.println("Ingrese el peso: ");
                Edad = cout.nextInt();
                System.out.println("Ingrese la edad: ");
                Peso = cout.nextDouble();
                System.out.println("Ingrese la temperatura: ");
                Temp = cout.nextDouble();
            }
        }
    }
    
    public void AptoVacunaB(int edad, double peso, double temp){
        int condicion = 0;
        while(condicion == 0){
            System.out.println(edad);
            System.out.println(peso);
            System.out.println(temp);
            System.out.println("-------");
            if(temp <= 40 && temp >= 37 && peso > 5 && edad > 1){
                System.out.println("El perro está sano");
            }
            else{
                System.out.println("El perro está enfermo");
            }
            
            System.out.println("Desea cambiar la temperatura, la edad y el peso? (SI = 0 / NO = 1)");
            condicion = cout.nextInt();
            if (condicion == 0){
                System.out.println("Ingrese el peso: ");
                peso = cout.nextDouble();
                System.out.println("Ingrese la edad: ");
                edad = cout.nextInt();
                System.out.println("Ingrese la temperatura: ");
                temp = cout.nextDouble();
            }
        }
    }
}


