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

    public Persona darBajaCliente(Persona persona) {
        int indice = -1;
        for (int i = 0; i < cantidadClientes; i++) {
            if (clientes[i].equals(persona)) {
                indice = i;
                break;
            }
        }

        if (indice != -1) {
            Persona clienteEliminado = clientes[indice];
            clientes[indice] = clientes[cantidadClientes - 1];
            clientes[cantidadClientes - 1] = null;
            cantidadClientes--;
            return clienteEliminado;
        } else {
            return null;
        }
    }

    public void clienteTipo(char tipo) {
        System.out.println("Clientes de tipo " + tipo + " en el banco " + nombre + ":");
        for (int i = 0; i < cantidadClientes; i++) {
            Persona cliente = clientes[i];
            char tipoCliente = obtenerTipoCliente(cliente);
            if (tipoCliente == tipo) {
                System.out.println(cliente.toString());
            }
        }
    }

    private char obtenerTipoCliente(Persona persona) {
        return 'C';
    }

    public void mostrarClientes() {
        StringBuilder infoClientes = new StringBuilder("Clientes del banco " + nombre + ":\n");
        for (int i = 0; i < cantidadClientes; i++) {
            infoClientes.append(clientes[i].toString()).append("\n");
        }
        System.out.println(infoClientes.toString());
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

    public boolean buscarCliente(Persona persona) {
        for (int i = 0; i < cantidadClientes; i++) {
            if (clientes[i].equals(persona)) {
                return true;
            }
        }
        return false;
    }
}