public class EmpleadoProduccion extends Asalariado {
    public EmpleadoProduccion(String nombre, long dni, int diasVacaciones, double salarioBase) {
        super(nombre, dni, diasVacaciones, salarioBase);
    }

    @Override
    public double calcularNomina() {
        return getSalarioBase() * 1.15;
    }

    @Override
    public String toString() {
        return "empleado de producción " + getDni() + "," + getNombre() + "," + getDiasVacaciones() + "," + calcularNomina();
    }
}
