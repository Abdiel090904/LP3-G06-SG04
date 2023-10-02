public class Banco {
    private String nombre;
    private Persona clientes[];
    private int cantidadClientes;

    public Banco(String nombre) {
        this(nombre, 20);
    }

    public Banco(String nombre, int numCli) {
        this.nombre = nombre;
        this.clientes = new Persona[numCli];
        this.cantidadClientes = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Persona[] getClientes() {
        return clientes;
    }

    public void agregarCliente(Persona persona) {
        if (!buscarCliente(persona)) {
            if (cantidadClientes < clientes.length) {
                clientes[cantidadClientes] = persona;
                cantidadClientes++;
            } else {
                System.out.println("No hay espacio disponible para agregar más clientes.");
            }
        } else {
            System.out.println("El cliente ya existe en el banco y no puede ser duplicado.");
        }
    }

    public Persona darBajaCliente(Persona persona) {
        return null;
    }

    public boolean buscarCliente(Persona persona) {
        for (int i = 0; i < cantidadClientes; i++) {
            if (clientes[i].equals(persona)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder infoClientes = new StringBuilder("Clientes del banco " + nombre + ":\n");
        for (int i = 0; i < cantidadClientes; i++) {
            infoClientes.append(clientes[i].toString()).append("\n");
        }
        return infoClientes.toString();
    }
}
