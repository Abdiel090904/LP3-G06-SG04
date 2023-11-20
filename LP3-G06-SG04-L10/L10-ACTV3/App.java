public class App {
    public static void main(String[] args) {
        try {
            Integer[] intArray = {1, 2, 3, 4, 5};
            Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
            Character[] charArray = {'H', 'O', 'L', 'A'};
            Float[] floatArray = {1.8f, 2.3f, 3.5f, 4.8f, 5.6f};
            Boolean[] boolArray = {true, false, true, false};

            System.out.printf("Array intArray contiene (rango 1-2):%n");
            imprimirArray(intArray, 1, 2);

            System.out.printf("%nArray doubleArray contiene (rango 3-4):%n");
            imprimirArray(doubleArray, 3, 4);

            System.out.printf("%nArray charArray contiene (rango 1-3):%n");
            imprimirArray(charArray, 1, 3);

            System.out.printf("%nArray floatArray contiene (rango 1-3):%n");
            imprimirArray(floatArray, 1, 3);

            System.out.printf("%nArray boolArray contiene (rango 2-3):%n");
            imprimirArray(boolArray, 2, 3);

        } catch (LimiteInvalidoException e) {
            System.out.println("Se ha producido una excepción: " + e.getMessage());
        }
    }

    public static <T> void imprimirArray(T[] inputArray, int limiteInferior, int limiteSuperior) throws LimiteInvalidoException {
        if (limiteInferior < 0 || limiteSuperior >= inputArray.length || limiteInferior > limiteSuperior) {
            throw new LimiteInvalidoException("Límites inválidos. Error");
        }

        for (int i = limiteInferior; i <= limiteSuperior; i++) {
            System.out.printf("%s ", inputArray[i]);
        }
        System.out.println();
    }
}

class LimiteInvalidoException extends Exception {
    public LimiteInvalidoException(String mensaje) {
        super(mensaje);
    }
}
