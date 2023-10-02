public class TestHerencia {

    public static void main(String[] args) {
        Asalariado empleado1 = new Asalariado("Manuel Cortina", 12345678, 28, 2000.0);
        EmpleadoProduccion empleado2 = new EmpleadoProduccion("noche", 55333222, 30, 2500.0);
        EmpleadoDistribucion empleado3 = new EmpleadoDistribucion("Granada", 55333666, 35, 2200.0);

        double nominaEmpleado1 = empleado1.calcularNomina();
        double nominaEmpleado2 = empleado2.calcularNomina();
        double nominaEmpleado3 = empleado3.calcularNomina();

        System.out.println("Nómina del empleado 1: " + nominaEmpleado1);
        System.out.println("Nómina del empleado 2: " + nominaEmpleado2);
        System.out.println("Nómina del empleado 3: " + nominaEmpleado3);

        System.out.println(empleado1.toString());
        System.out.println(empleado2.toString());
        System.out.println(empleado3.toString());
    }
}





