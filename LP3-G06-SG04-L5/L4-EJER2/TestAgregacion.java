public class TestAgregacion {

    public static void main(String[] args) {
        // Crear un automóvil con motor
        Motor motor1 = new Motor(25, 100);
        Automovil automovilConMotor = new Automovil("A85AC", 4, "TOYOTA", "Camry", motor1);

        // Crear un automóvil sin motor
        Automovil automovilSinMotor = new Automovil("AU398", 3, "Toyota", "Corolla", null);

        // Mostrar información de ambos automóviles
        System.out.println(automovilConMotor);
        System.out.println();
        System.out.println(automovilSinMotor);
    }
}
