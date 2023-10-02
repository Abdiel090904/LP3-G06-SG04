import java.util.Scanner;

public class TestAsociacion {

    public static void main(String[] args) {
        Banco bcp = new Banco("BCP");
        Banco bbva = new Banco("BBVA", 30);
        Scanner scanner = new Scanner(System.in);

        bcp.agregarCliente(new Persona("Juan Perez"));
        bcp.agregarCliente(new Persona("Maria Gomez"));

        bbva.agregarCliente(new Persona("Carlos Lopez"));

        System.out.println("Clientes del BCP:");
        for (Persona cliente : bcp.getClientes()) {
            if (cliente != null) {
                System.out.println(cliente.getNombre());
            }
        }

        System.out.println("Clientes del BBVA:");
        for (Persona cliente : bbva.getClientes()) {
            if (cliente != null) {
                System.out.println(cliente.getNombre());
            }
        }

        System.out.println("Ingrese el nombre del cliente a buscar en el BCP:");
        String nombreCliente = scanner.nextLine();
        boolean encontrado = bcp.buscarCliente(new Persona(nombreCliente));
        if (encontrado) {
            System.out.println("El cliente " + nombreCliente + " se encuentra en el BCP.");
        } else {
            System.out.println("El cliente " + nombreCliente + " no se encuentra en el BCP.");
        }

        scanner.close();
    }
}

