
public class Producto {
    String nombre;
    double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "\nProducto: \n" +
                "Nombre: " + nombre +
                "\nPrecio: " + precio + "\n";
    }
}
