public class Cuenta {
    private String numeroCuenta;
    private Persona titular;

    public Cuenta(String numeroCuenta, Persona titular) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.titular.setSaldo(50.0);
    }

    public void depositar(double cantidad) {
        if (cantidad > 0) {
            this.titular.depositar(cantidad);
        } else {
            System.out.println("La cantidad a depositar debe ser mayor que cero.");
        }
    }

    public void retirar(double cantidad) {
        if (cantidad > 0) {
            this.titular.retirar(cantidad);
        } else {
            System.out.println("La cantidad a retirar debe ser mayor que cero.");
        }
    }

    @Override
    public String toString() {
        return "Número de Cuenta: " + numeroCuenta + "\nTitular:\n" + titular + "\nSaldo: " + String.format("%.2f", titular.getSaldo());
    }
}
