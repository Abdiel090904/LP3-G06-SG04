package persona;
import java.util.Scanner;

public class Persona {
    public static void main(String[] args) {
        Scanner cout = new Scanner (System.in);
        //sput espacio
        System.out.println("INGRESE LOS DATOS DE LA PERSONA");

        String nombre;
        String apellido;
        String sexo;
        //Año de nacimiento
        int dia;
        int mes;
        int año;
        double altura; //en centimetros
        double peso; // en kilogramas

        System.out.println("Ingrese el nombre: ");
        nombre = cout.nextLine();
        
        System.out.println("Ingrese el apellido: ");
        apellido = cout.nextLine();
        
        System.out.println("Ingrese el sexo: ");
        sexo = cout.nextLine();
        
        System.out.println("Ingrese el dia de nacimiento: ");
        dia = cout.nextInt();
        
        System.out.println("Ingrese el mes de nacimiento: ");
        mes = cout.nextInt();
        
        System.out.println("Ingrese el año de nacimiento: ");
        año = cout.nextInt();
        
        System.out.println("Ingrese la altura: ");
        altura = cout.nextDouble();
        
        System.out.println("Ingrese el peso: ");
        peso = cout.nextDouble();
        
        PerfilMedico persona;
        
        persona = new PerfilMedico(nombre,apellido,sexo,dia,mes,año,altura,peso);
        System.out.println(persona);
        persona.CalcularEdad(mes, año);
        persona.FMC();
        persona.IMC(peso, altura);
    }
}
