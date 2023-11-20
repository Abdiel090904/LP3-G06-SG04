class Persona {
    String nombre;
    int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "\nPersona:\n" +
                "Nombre: " + nombre +
                "\nEdad: " + edad +"\n";
    }
}
