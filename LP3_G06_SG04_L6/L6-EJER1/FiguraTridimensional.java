abstract class FiguraTridimensional extends Figura {
    public abstract double obtenerVolumen();
    @Override
    public String obtenerTipo() {
        return "Tridimensional";
    }
}

