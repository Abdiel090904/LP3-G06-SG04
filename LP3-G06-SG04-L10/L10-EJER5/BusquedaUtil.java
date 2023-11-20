public class BusquedaUtil {
    public static <T extends Number & Comparable<T>> int buscarElementoNumerico(T[] arreglo, T elemento) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }
}
