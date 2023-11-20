public class Main {
    public static void main(String[] args) {

        Integer[] enteros = {1, 2, 3, 4, 5};
        int elementoEnteroBuscado = 3;
        int posicionEntero = BusquedaUtil.buscarElementoNumerico(enteros, elementoEnteroBuscado);
        System.out.println("Número entero encontrado en la posición: " + posicionEntero);

        Double[] decimales = {1.5, 2.5, 3.5, 4.5, 5.5};
        double elementoDecimalBuscado = 3.5;
        int posicionDecimal = BusquedaUtil.buscarElementoNumerico(decimales, elementoDecimalBuscado);
        System.out.println("Número decimal encontrado en la posición: " + posicionDecimal);

    }
}
