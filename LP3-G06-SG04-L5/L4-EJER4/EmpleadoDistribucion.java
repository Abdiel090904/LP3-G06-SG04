public class EmpleadoDistribucion extends Asalariado {
    public EmpleadoDistribucion(String nombre, long dni, int diasVacaciones, double salarioBase) {
        super(nombre, dni, diasVacaciones, salarioBase);
    }

    @Override
    public double calcularNomina() {
        return getSalarioBase() * 1.10;
    }

    @Override
    public String toString() {
        return "empleado de distribución " + getDni() + "," + getNombre() + "," + getDiasVacaciones() + "," + calcularNomina();
    }
}
