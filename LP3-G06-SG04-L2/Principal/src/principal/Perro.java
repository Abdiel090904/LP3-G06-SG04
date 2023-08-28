package principal;
public class Perro {
    private String raza;
    private int edad;
    private String color;
    public double peso;
    private double temp;

    public String getRaza() { //get no tiene entrada de datos
        return raza;
    }
    public void setRaza(String raza) { // set no retorna nada
        this.raza = raza;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getTemp() {
        return temp;
    }
    public void setTemp(double temp) {
        this.temp = temp;
    }
    public void ladrar(){
        System.out.println("Esta ladrando");
    }
    public void dormir(){
        System.out.println("Esta durmiendo");
    }
    public void comer(){
        System.out.println("Esta cominedo");
    }
    public Perro(String raza, int edad, String color, double peso, double temp){
        this.raza = raza;
        this.edad = edad;
        this.color = color;
        this.peso = peso;
        this.temp = temp;
    }
    public void IncreEdad(int anios){
        this.edad += anios;
        CambiarPeso(anios);
    }
    private void CambiarPeso(int anios){
        this.peso += (anios*1.5);
    } 
    @Override
    public String toString() {
        return "Perro{" + "raza=" + raza + ", edad=" + edad + ", color=" + color + ", peso=" + peso + ", temp=" + temp + '}';
    }
}
