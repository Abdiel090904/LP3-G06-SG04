public class Persona {
    private int clienteID;
    private String nombre;
    private String apellido;
    private char tipoCliente;
    private String numeroCuenta;
    private double saldo;

    public Persona(int clienteID, String nombre, String apellido, char tipoCliente) {
        this.clienteID = clienteID;
        this.nombre = nombre;
        this.apellido = apellido;
        asignarTipoCliente(tipoCliente);
        asignarNumeroCuenta();
        this.saldo = 0;
    }

    public void asignarTipoCliente(char tipo) {
        if (tipo == 'C' || tipo == 'B' || tipo == 'E') {
            this.tipoCliente = tipo;
        } else {
            System.out.println("Tipo de cliente no válido. Usando tipo por defecto 'C'.");
            this.tipoCliente = 'C';
        }
    }

    private void asignarNumeroCuenta() {
        int numeroBase;
        if (tipoCliente == 'C') {
            numeroBase = 1000;
        } else if (tipoCliente == 'B') {
            numeroBase = 5000;
        } else {
            numeroBase = 8000;
        }
        this.numeroCuenta = tipoCliente + Integer.toString(numeroBase);
    }

    public void depositar(double cantidad) {
        if (cantidad > 0) {
            this.saldo += cantidad;
        } else {
            System.out.println("La cantidad a depositar debe ser mayor que cero.");
        }
    }

    public void retirar(double cantidad) {
        if (cantidad > 0) {
            if (this.saldo - cantidad >= 50.0) {
                this.saldo -= cantidad;
            } else {
                System.out.println("El saldo mínimo de la cuenta debe ser de 50 soles. No se puede retirar esta cantidad.");
            }
        } else {
            System.out.println("La cantidad a retirar debe ser mayor que cero.");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cliente: " + clienteID + "\nTipo: " + tipoCliente + "\nNombres: " + nombre + " " + apellido + 
           "\nNro Cuenta: " + numeroCuenta + "\nSaldo: " + String.format("%.2f", saldo);
    }
}