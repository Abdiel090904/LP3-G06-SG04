public class EmpleadoAsalariado extends Empleado {
    private double salarioSemanal;

    public EmpleadoAsalariado(String nombre, String apellido, String nss, double salario) {
        super(nombre, apellido, nss);
        establecerSalarioSemanal(salario);
    }

    private void establecerSalarioSemanal(double salario) {
        salarioSemanal = salario;
    }

    private double obtenerSalarioSemanal() {
        return salarioSemanal;
    }

    @Override
    public double ObtenerMontoPago() {
        return obtenerSalarioSemanal();
    }

    @Override
    public String toString() {
        return "EmpleadoAsalariado\nSalario semanal: " + salarioSemanal;
    }
}
