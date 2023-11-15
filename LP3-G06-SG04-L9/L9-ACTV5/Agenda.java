package l9.actv5;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Agenda {
    ArrayPersona lista;
    final int longLinea = 32;
    public Agenda() {
        this.lista = cargaContactos();
    }
    public void bucle() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String nombre;
            while (true) {
                System.out.println("Introduzca un nombre o presione <Enter> para salir: ");
                nombre = reader.readLine().trim();
                if (nombre.equals("")) {
                    break;
                }
                lista.printArray(nombre);
            }
        } catch (IOException e) {
            System.out.println("Error en la entrada de datos: " + e.getMessage());
        }
    }
    private ArrayPersona cargaContactos() {
        ArrayPersona directorio = new ArrayPersona();
        try {
            BufferedReader br = new BufferedReader(new FileReader("src/Agenda.txt"));
            String nombre, telefono, direccion;
            while ((nombre = br.readLine()) != null) {
                telefono = br.readLine();
                direccion = br.readLine();
                directorio.addArray(new Persona(nombre, telefono, direccion));
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Error en la carga de los contactos: " + e.getMessage());
            System.exit(1);
        }
        return directorio;
    }
}

