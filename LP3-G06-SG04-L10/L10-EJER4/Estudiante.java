public class Estudiante extends Persona {
    private String carrera;

    public Estudiante(String dni, String nombres, String carrera) {
        super(dni, nombres, ""); 
        this.carrera = carrera;
    }

    public String getCarrera() {
        return carrera;
    }
}
