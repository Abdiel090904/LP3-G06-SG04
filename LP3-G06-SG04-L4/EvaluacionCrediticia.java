import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class EvaluacionCrediticia {
    ArrayList<Datos> Personas = new ArrayList<>();
    public static void main(String[] args) {
        EvaluacionCrediticia evaluacion = new EvaluacionCrediticia();
        evaluacion.ejecutar();
    }
    public void ejecutar() {
        Random random = new Random();
        String defsexo, deftrabaja;
        int totalPersonas = 8;
        int hombres = 0;
        int mujeres = 0;
        int hombresTrabajan = 0;
        int mujeresTrabajan = 0;
        int sueldoHombresTrabajan = 0;
        int sueldoMujeresTrabajan = 0;

        for (int i = 0; i < totalPersonas; i++) {
            //Definiendo el sexo
            int sexo = random.nextInt(2)+1;// 1 = M, 2 = F
            if (sexo == 1){
                defsexo = "Masculino";
                hombres++;
            }else{
                defsexo = "Femenino";
                mujeres++;
            }
            
            //Definiendo si trabaja
            int trabaja = random.nextInt(2)+1; // 1 = si, 2 = no
            int sueldo = 0;
            if (trabaja == 1) {
                deftrabaja = "Sí";
                sueldo = random.nextInt(2051) + 950;
            }else{
                deftrabaja = "No";
            }
            
            if (sexo == 1) {
                if (trabaja == 1) {
                    hombresTrabajan++;
                    sueldoHombresTrabajan += sueldo;
                }
            } else {
                if (trabaja == 1) {
                    mujeresTrabajan++;
                    sueldoMujeresTrabajan += sueldo;
                }
            }
            Datos nuevaPersona = new Datos(defsexo, deftrabaja, sueldo);
            Personas.add(nuevaPersona);
        }
        System.out.println("\t______________Datos_______________");
        for (Datos datos : Personas) {
            System.out.println(datos);
        }
        
        double porcentajeHombres = (double) hombres / totalPersonas * 100;
        double porcentajeMujeres = (double) mujeres / totalPersonas * 100;
        double porcentajeHombresTrabajan = (double) hombresTrabajan / totalPersonas * 100;
        double porcentajeMujeresTrabajan = (double) mujeresTrabajan / totalPersonas * 100;
        double sueldoPromedioHombresTrabajan = (double) sueldoHombresTrabajan / hombresTrabajan;
        double sueldoPromedioMujeresTrabajan = (double) sueldoMujeresTrabajan / mujeresTrabajan;

        System.out.println("\na) Porcentaje de hombres: " + porcentajeHombres + "%");
        System.out.println("b) Porcentaje de mujeres: " + porcentajeMujeres + "%");
        System.out.println("c) Porcentaje de hombres que trabajan: " + porcentajeHombresTrabajan + "%");
        System.out.println("d) Porcentaje de mujeres que trabajan: " + porcentajeMujeresTrabajan + "%");
        System.out.println("e) Sueldo promedio de hombres que trabajan: " + sueldoPromedioHombresTrabajan);
        System.out.println("f) Sueldo promedio de mujeres que trabajan: " + sueldoPromedioMujeresTrabajan);
    }
}
