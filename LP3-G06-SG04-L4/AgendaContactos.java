import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AgendaContactos {
    private ArrayList<Contacto> agenda = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        AgendaContactos miAgenda = new AgendaContactos();
        miAgenda.ejecutar();
    }

    public void ejecutar() {
        while (true) {
            System.out.println("Menú de Agenda de Contactos:");
            System.out.println("1. Añadir contacto");
            System.out.println("2. Buscar contacto");
            System.out.println("3. Modificar contacto");
            System.out.println("4. Borrar contacto");
            System.out.println("5. Mostrar contactos");
            System.out.println("6. Borrar todos los contactos");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    agregarContacto();
                    break;
                case 2:
                    buscarContacto();
                    break;
                case 3:
                    modificarContacto();
                    break;
                case 4:
                    borrarContacto();
                    break;
                case 5:
                    mostrarContactos();
                    break;
                case 6:
                    borrarTodosContactos();
                    break;
                case 7:
                    System.out.println("Saliendo de la aplicación.");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elija una opción válida.");
            }
        }
    }

    public void agregarContacto() {
        System.out.print("Nombre del contacto: ");
        String nombre = scanner.nextLine();
        System.out.print("Teléfono del contacto: ");
        String telefono = scanner.nextLine();
        System.out.print("Dirección del contacto: ");
        String direccion = scanner.nextLine();

        Contacto nuevoContacto = new Contacto(nombre, telefono, direccion);
        agenda.add(nuevoContacto);
        System.out.println("Contacto agregado con éxito.");
    }

    public void buscarContacto() {
        System.out.print("Nombre del contacto a buscar: ");
        String nombreBuscado = scanner.nextLine();
        boolean encontrado = false;

        for (Contacto contacto : agenda) {
            if (contacto.getNombre().equalsIgnoreCase(nombreBuscado)) {
                System.out.println("Contacto encontrado:");
                System.out.println(contacto);
                encontrado = true;
                break; 
            }
        }

        if (!encontrado) {
            System.out.println("Contacto no encontrado.");
        }
    }

    public void modificarContacto() {
        System.out.print("Nombre del contacto a modificar: ");
        String nombreModificado = scanner.nextLine();
        boolean encontrado = false;

        for (Contacto contacto : agenda) {
            if (contacto.getNombre().equalsIgnoreCase(nombreModificado)) {
                System.out.print("Nuevo teléfono: ");
                String nuevoTelefono = scanner.nextLine();
                System.out.print("Nueva dirección: ");
                String nuevaDireccion = scanner.nextLine();

                contacto.setTelefono(nuevoTelefono);
                contacto.setDireccion(nuevaDireccion);
                System.out.println("Contacto modificado con éxito.");
                encontrado = true;
                break; 
            }
        }

        if (!encontrado) {
            System.out.println("Contacto no encontrado.");
        }
    }

    public void borrarContacto() {
        System.out.print("Nombre del contacto a borrar: ");
        String nombreBorrar = scanner.nextLine();
        boolean eliminado = false;

        Iterator<Contacto> iterador = agenda.iterator();
        while (iterador.hasNext()) {
            Contacto contacto = iterador.next();
            if (contacto.getNombre().equalsIgnoreCase(nombreBorrar)) {
                iterador.remove(); 
                System.out.println("Contacto borrado con éxito.");
                eliminado = true;
            }
        }
        if (!eliminado) {
            System.out.println("Contacto no encontrado.");
        }
    }

    public void borrarTodosContactos() {
        Iterator<Contacto> iterador = agenda.iterator();
        while (iterador.hasNext()) {
            Contacto contacto = iterador.next();
            iterador.remove(); 
        }
        System.out.println("Todos los contactos han sido borrados.");
    }


    public void mostrarContactos() {
        System.out.println("Lista de contactos:");
        for (Contacto contacto : agenda) {
            System.out.println(contacto);
        }
    }
}
