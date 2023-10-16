class Tetraedro extends FiguraTridimensional {
    private double arista;
    private String aplicacion;

    public Tetraedro(double arista,String aplicacion) {
        this.arista = arista;
        this.aplicacion = aplicacion;
    }
    public String obtenerAplicacion() {
        return "Aplicación: "+aplicacion;
    }
    @Override
    public double obtenerArea() {
        return Math.sqrt(3) * arista * arista;
    }

    @Override
    public double obtenerVolumen() {
        return (Math.pow(arista, 3)) / (6 * Math.sqrt(2));
        
    }
}

