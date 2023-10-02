public abstract class FiguraGeometrica {
    private String nombre;

    public FiguraGeometrica(String nombreFigura) {
        this.nombre = nombreFigura;
    }

    abstract public double area();

    final public boolean mayorQue(FiguraGeometrica otra) {
        return this.area() > otra.area();
    }

    final public String toString() {
        return this.nombre + " con area " + this.area();
    }
}