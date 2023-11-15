package l9.marcteo;
import java.io.File;
public class L9MARCTEO {
    public static void main(String[] args) {
        if (args. length > 0) {
            for(int i = 0; 1 < args.length; i++) {
                File f = new File(args[i]);
                System.out.println("Nombre: " + f.getName());
                System.out.println("Ruta: " + f.getPath());
            if (f.exists()) {
                System.out.print ("Archivo existe");
                System.out.print((f.canRead()? " y se puede lee" : ""));
                System.out.print((f.canWrite())? " y se puede escribir": "");
                System.out.println(".");
                System.out.println("La longitud del archivo es " + f.length() + "bytes" );
            }
            else {
                System.out.println("El archivo no existe.");
            }
        }
    }
    else{
            System.out.println("Debe indicar un archivo.");
        }
    }
}
