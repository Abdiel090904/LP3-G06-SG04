import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        String[] arrayString1 = {"uno", "dos", "tres"};
        String[] arrayString2 = {"dos", "tres", "cuatro"};
        String[] resultString = copyArray(arrayString1, arrayString2);
        System.out.println(Arrays.toString(resultString));

        Producto[] arrayProducto1 = {new Producto("Laptop", 1000), new Producto("Teléfono", 500)};
        Producto[] arrayProducto2 = {new Producto("Tablet", 300), new Producto("Laptop", 1000)};
        Producto[] resultProducto = copyArray(arrayProducto1, arrayProducto2);
        System.out.println(Arrays.toString(resultProducto));

        Persona[] arrayPersona1 = {new Persona("Jose Luis", 25), new Persona("María", 30)};
        Persona[] arrayPersona2 = {new Persona("Roberto", 22), new Persona("Kenny", 25)};
        Persona[] resultPersona = copyArray(arrayPersona1, arrayPersona2);
        System.out.println(Arrays.toString(resultPersona));
    }


    public static <T> T[] copyArray(T[] array1, T[] array2) {
        Set<T> resultSet = new HashSet<>(Arrays.asList(array1));
        resultSet.addAll(Arrays.asList(array2));

        return resultSet.toArray(Arrays.copyOf(array1, 0));
    }
}
