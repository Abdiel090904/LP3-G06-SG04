import java.util.Scanner;

public class TestAsociacion {

    public static void main(String[] args) {
        Banco bcp = new Banco("BCP");
        Banco bbva = new Banco("BBVA", 30);
        Scanner scanner = new Scanner(System.in);

        bcp.agregarCliente(new Persona("Andrea Perez"));
        bcp.agregarCliente(new Persona("Maria Bolañoz"));
        bbva.agregarCliente(new Persona("Carlos Lopez"));

        bcp.mostrarClientes();

        bbva.mostrarClientes();

        System.out.println("Ingrese el nombre del cliente a buscar en el BCP:");
        String nombreCliente = scanner.nextLine();
        boolean encontrado = bcp.buscarCliente(new Persona(nombreCliente));
        if (encontrado) {
            System.out.println("El cliente " + nombreCliente + " se encuentra en el BCP.");
        } else {
            System.out.println("El cliente " + nombreCliente + " no se encuentra en el BCP.");
        }

        System.out.println("Ingrese el nombre del cliente a dar de baja en el BCP:");
        String clienteABaja = scanner.nextLine();
        Persona clienteEliminado = bcp.darBajaCliente(new Persona(clienteABaja));
        if (clienteEliminado != null) {
            System.out.println("Se ha dado de baja al cliente: " + clienteEliminado.getNombre());
        } else {
            System.out.println("El cliente " + clienteABaja + " no se encontró en el BCP.");
        }

        System.out.println("Ingrese el tipo de cliente a listar (C/B/E):");
        char tipoCliente = scanner.nextLine().charAt(0);
        bcp.clienteTipo(tipoCliente);

        scanner.close();
    }
}




