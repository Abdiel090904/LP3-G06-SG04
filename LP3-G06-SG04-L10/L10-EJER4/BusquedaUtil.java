public class BusquedaUtil {

    public static int buscarProductoPorCodigo(Producto[] productos, String codigo) {
        for (int i = 0; i < productos.length; i++) {
            if (productos[i].getCodigo().equals(codigo)) {
                return i;
            }
        }
        return -1;
    }

    public static int buscarPersonaPorNombre(Persona[] personas, String nombres) {
        for (int i = 0; i < personas.length; i++) {
            if (personas[i].getNombres().equals(nombres)) {
                return i;
            }
        }
        return -1;
    }

    public static int buscarEstudiantePorNombresYCarrera(Estudiante[] estudiantes, String nombres, String carrera) {
        for (int i = 0; i < estudiantes.length; i++) {
            if (estudiantes[i].getNombres().equals(nombres) && estudiantes[i].getCarrera().equals(carrera)) {
                return i;
            }
        }
        return -1;
    }
}
