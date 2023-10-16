class Circulo extends FiguraBidimensional {
    private double radio;
    private String color;
    public Circulo(double radio, String color) {
        this.radio = radio;
        this.color = color;
    }

    public String obtenerColor(){
        return "Color:"+color;
    }
    @Override
    public double obtenerArea() {
        return Math.PI * radio * radio;
    }
}

