public class Factura implements PorPagar {
    private String numeroPieza;
    private String descripcionPieza;
    private int cantidad;
    private double precioPorArticulo;

    public Factura(String pieza, String descripcion, int cuenta, double precio) {
        numeroPieza = pieza;
        descripcionPieza = descripcion;
        establecerCantidad(cuenta);
        establecerPrecioPorArticulo(precio);
    }

    private void establecerCantidad(int cuenta) {
        cantidad = cuenta;
    }

    private void establecerPrecioPorArticulo(double precio) {
        precioPorArticulo = precio;
    }

    private int obtenerCantidad() {
        return cantidad;
    }

    private double obtenerPrecioPorArticulo() {
        return precioPorArticulo;
    }

    @Override
    public double ObtenerMontoPago() {
        return obtenerCantidad() * obtenerPrecioPorArticulo();
    }

    @Override
    public String toString() {
        return "Factura \nNúmero de pieza: " + numeroPieza + "\nDescripciónde pieza: " + descripcionPieza + "\nCantidad:: " + cantidad
                + "\nPrecio por articulo: " + precioPorArticulo;
    }
}
