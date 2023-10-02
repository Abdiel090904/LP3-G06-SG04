public class Asalariado {
    private String nombre;
    private long dni;
    private int diasVacaciones;
    private double salarioBase;

    public Asalariado(String nombre, long dni, int diasVacaciones, double salarioBase) {
        this.nombre = nombre;
        this.dni = dni;
        this.diasVacaciones = diasVacaciones;
        this.salarioBase = salarioBase;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nuevo_nombre) {
        this.nombre = nuevo_nombre;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long nuevo_dni) {
        this.dni = nuevo_dni;
    }

    public int getDiasVacaciones() {
        return diasVacaciones;
    }

    public void setDiasVacaciones(int nuevo_diasVacaciones) {
        this.diasVacaciones = nuevo_diasVacaciones;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double nuevo_salarioBase) {
        this.salarioBase = nuevo_salarioBase;
    }

    public double calcularNomina() {
        return salarioBase;
    }

    @Override
    public String toString() {
        return "empleado asalariado " + dni + "," + nombre + "," + diasVacaciones + "," + salarioBase;
    }
}
