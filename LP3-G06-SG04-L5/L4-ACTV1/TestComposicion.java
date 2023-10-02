
import java.util.Scanner;
public class TestComposicion {
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta(2023, 200.0);

        Persona persona1 = new Persona(1, "Jair", "Lopez", cuenta1);

        System.out.println(persona1);

        System.out.println("\n\nNúmero de cuenta: " + persona1.getCuenta().getNumero());
        System.out.println("Saldo de la cuenta: " + persona1.getCuenta().getSaldo());
    }
}

