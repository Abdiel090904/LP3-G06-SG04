/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejer1;

/**
 *
 * @author Usuario
 */
public class Rectangulo {
    private Coordenada esquina1;
    private Coordenada esquina2;
    private String color;

    private static String ultimoColor = "rojo";

    public Rectangulo(double base, double altura) {
        this.color = obtenerSiguienteColor();
        this.esquina1 = new Coordenada(0, 0);
        this.esquina2 = new Coordenada((int) base, (int) altura); // Conversión explícita
    }

    public Coordenada getEsquina1() {
        return esquina1;
    }

    public void setEsquina1(Coordenada esquina1) {
        this.esquina1 = esquina1;
    }

    public Coordenada getEsquina2() {
        return esquina2;
    }

    public void setEsquina2(Coordenada esquina2) {
        this.esquina2 = esquina2;
    }

    public String getColor() {
        return color;
    }

    private String obtenerSiguienteColor() {
        if (ultimoColor.equals("verde")) {
            ultimoColor = "amarillo";
        } else {
            ultimoColor = "verde";
        }
        return ultimoColor;
    }

    public double calcularArea() {
        double base = Math.abs(esquina2.getX() - esquina1.getX());
        double altura = Math.abs(esquina2.getY() - esquina1.getY());
        return base * altura;
    }

    public double calcularPerimetro() {
        double base = Math.abs(esquina2.getX() - esquina1.getX());
        double altura = Math.abs(esquina2.getY() - esquina1.getY());
        return 2 * (base + altura);
    }

    @Override
    public String toString() {
        return "Rectángulo [Esquina1=" + esquina1 + ", Esquina2=" + esquina2 + "]";
    } 
}
