
import java.util.Scanner;
public class TestAgregacion {

    public static void main(String[] args) {
        Motor motor1 = new Motor(25, 100);

        Automovil automovil1 = new Automovil("A85AC",4,"TOYOTA","Camry", motor1);

        System.out.println(automovil1);
    }
}

