package usuario;
import java.util.Scanner;

public class CuentaBanco {
    Scanner cout = new Scanner (System.in);
    private String titular;
    private double cantidad = 0;
    // El titular sera obligatorio
    // La cantidad opcional
    public CuentaBanco(String titular){
        this.titular = titular;
    }
    
    public CuentaBanco(String titular, double cantidad){
        this.titular = titular;
        this.cantidad = cantidad;
    }
    
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    
    @Override
    public String toString() {
        return "CuentaBanco{" + "titular=" + titular + ", cantidad=" + cantidad + '}';
    }
    
    public double ingresar(double cantidad){
        System.out.println("Ingrese la cantidad a añadir: ");
        double ingreso = cout.nextDouble();
        if(ingreso > 0){
            this.cantidad += ingreso;
        }
        return this.cantidad;
    }
    
    public double retirar(double cantidad){
        System.out.println("Ingrese la cantidad a retirar: ");
        double ingreso2 = cout.nextDouble();
        if(this.cantidad-ingreso2 < 0){
            this.cantidad = 0;
        }
        else{
            this.cantidad = this.cantidad - ingreso2;
        }
        return this.cantidad;
    }
    
    
}
