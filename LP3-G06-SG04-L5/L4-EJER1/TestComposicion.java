public class TestComposicion {
    public static void main(String[] args) {
        Persona persona1 = new Persona(1, "Jair", "Ccama", 'C');
        Cuenta cuenta1 = new Cuenta("C1000", persona1);
        cuenta1.depositar(500);
        cuenta1.retirar(200);

        System.out.println("Información de la Persona:");
        System.out.println(persona1);

        System.out.println("\nInformación de la Cuenta:");
        System.out.println(cuenta1);

        persona1.asignarTipoCliente('A');
        Cuenta cuenta2 = new Cuenta("A5000", persona1);
        cuenta2.depositar(1000);
        cuenta2.retirar(300);

        System.out.println("\nInformación de la Nueva Cuenta:");
        System.out.println(cuenta2);
    }
}
