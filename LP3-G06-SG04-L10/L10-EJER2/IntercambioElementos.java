public class IntercambioElementos {

    public static <T> void intercambiarElementos(T[] array, int indice1, int indice2) {
        if (indice1 < 0 || indice1 >= array.length || indice2 < 0 || indice2 >= array.length) {
            System.out.println("Índices fuera de rango. No se puede realizar el intercambio.");
            return;
        }

        T temp = array[indice1];
        array[indice1] = array[indice2];
        array[indice2] = temp;
    }

    public static <T> void imprimirArray(T[] array) {
        for (T elemento : array) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] arrayEnteros = {16, 17, 18, 19, 20};
        
        System.out.println("Array original:");
        imprimirArray(arrayEnteros);

        intercambiarElementos(arrayEnteros, 1, 3);

        System.out.println("Array después del intercambio:");
        imprimirArray(arrayEnteros);
    }
}
