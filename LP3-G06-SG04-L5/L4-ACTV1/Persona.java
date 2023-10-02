public class Persona {
    private int id;
    private String nombre;
    private String apellido;
    private Cuenta cuenta;

    public Persona(int id, String nombre, String apellido, Cuenta cuenta) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cuenta = cuenta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    @Override
    public String toString() {
        return "\nPersona: " + "\nId: " + id + "\nNombre: " + nombre + "\nApellido: " + apellido + cuenta;
    }
}

