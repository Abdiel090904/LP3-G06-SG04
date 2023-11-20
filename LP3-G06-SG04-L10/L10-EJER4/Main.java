public class Main {
    public static void main(String[] args) {
        // Producto
        Producto[] productos = {
            new Producto("001", "Microondas", 105.99),
            new Producto("002", "Licuadora", 90.99),
            new Producto("003", "Batidora", 89.99)
        };

        String codigoProductoBuscado = "002";
        System.out.println("Datos ingresados del Producto:");
        for (Producto producto : productos) {
            System.out.println("Código: " + producto.getCodigo() + ", Descripción: " + producto.getDescripcion() + ", Precio: " + producto.getPrecio());
        }

        int posicionProducto = BusquedaUtil.buscarProductoPorCodigo(productos, codigoProductoBuscado);
        if (posicionProducto != -1) {
            System.out.println("\nProducto encontrado en la posición: " + posicionProducto);
            
            System.out.println("Detalles del Producto:");
            System.out.println("Código: " + productos[posicionProducto].getCodigo() + ", Descripción: " + productos[posicionProducto].getDescripcion() + ", Precio: " + productos[posicionProducto].getPrecio());
        } else {
            System.out.println("\nProducto no encontrado (-1)");
        }
        System.out.println("\n");
        //Persona
        Persona[] personas = {
            new Persona("12345678", "Mirella", "Av. Salaverry"),
            new Persona("87654321", "Raul", "Calle Salvador"),
            new Persona("56789012", "Flor", "Av. EEUU")
        };

        String nombresPersonaBuscada = "Raul";
        System.out.println("\nDatos ingresados de la Persona");
        for (Persona persona : personas) {
            System.out.println("DNI: " + persona.getDni() + ", Nombres: " + persona.getNombres() + ", Dirección: " + persona.getDireccion());
        }

        int posicionPersona = BusquedaUtil.buscarPersonaPorNombre(personas, nombresPersonaBuscada);
        if (posicionPersona != -1) {
            System.out.println("\nPersona encontrada en la posición: " + posicionPersona);
            
            System.out.println("Detalles de la Persona:");
            System.out.println("DNI: " + personas[posicionPersona].getDni() + ", Nombres: " + personas[posicionPersona].getNombres() + ", Dirección: " + personas[posicionPersona].getDireccion());
        } else {
            System.out.println("\nPersona no encontrada (-1)");
        }
        System.out.println("\n");
        // Estudiante
        Estudiante[] estudiantes = {
            new Estudiante("98765432", "Jair", "Ing. Industrial"),
            new Estudiante("34567890", "Maria", "Derecho"),
            new Estudiante("23456789", "Juan", "Nutricion")
        };

        String nombresEstudianteBuscado = "Andre";
        String carreraEstudianteBuscada = "Nutricion";
        System.out.println("\nDatos ingresados del Estudiante:");
        for (Estudiante estudiante : estudiantes) {
            System.out.println("DNI: " + estudiante.getDni() + ", Nombres: " + estudiante.getNombres() + ", Carrera: " + estudiante.getCarrera());
        }

        int posicionEstudiante = BusquedaUtil.buscarEstudiantePorNombresYCarrera(estudiantes, nombresEstudianteBuscado, carreraEstudianteBuscada);
        if (posicionEstudiante != -1) {
            System.out.println("\nEstudiante encontrado en la posición: " + posicionEstudiante);
            
            System.out.println("Detalles del Estudiante:");
            System.out.println("DNI: " + estudiantes[posicionEstudiante].getDni() + ", Nombres: " + estudiantes[posicionEstudiante].getNombres() + ", Carrera: " + estudiantes[posicionEstudiante].getCarrera());
        } else {
            System.out.println("\nEstudiante no encontrado (-1)");
        }
    }
}
