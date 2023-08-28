package usuario;
import java.util.Scanner;
public class Usuario {
    public static void main(String[] args) {
        String titular;
        double cantidad = 0;
        CuentaBanco Usuario1;
        Scanner cout = new Scanner (System.in);
        System.out.println("Ingrese el nombre del titular: ");
        titular = cout.nextLine();
        
        System.out.println("Desea ingresar cantidad incial(S = 1/N = 2): ");
        int rpta = cout.nextInt();
        if(rpta == 1){
            System.out.println("Ingrese la cantidad inicial: ");
            cantidad = cout.nextDouble();
            Usuario1 = new CuentaBanco(titular, cantidad);
        }
        else{
            cantidad = 0;
            Usuario1 = new CuentaBanco(titular);
        }
        
        int respuesta;
        int cont = 1;
        while(cont != 0){
            System.out.println("MENU:");
            System.out.println("1.- Ingresar");
            System.out.println("2.- Retirar");
            System.out.println("3.- Mostrar saldo");
            System.out.println("4.- Salir");
            System.out.println("Ingrese numero: ");
            respuesta = cout.nextInt();
        
            if(respuesta == 1){
                Usuario1.ingresar(cantidad);
            }
            if(respuesta == 2){
                Usuario1.retirar(cantidad);
            }
            if(respuesta == 3){
                System.out.println(Usuario1.getCantidad());
            }
            if(respuesta == 4){
                cont = 0;
            }
        }
        
    }
}
