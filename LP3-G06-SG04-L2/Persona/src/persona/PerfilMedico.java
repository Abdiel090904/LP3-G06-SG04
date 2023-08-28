package persona;
public class PerfilMedico {
    public String nombre;
    public String apellido;
    public String sexo;
    //Año de nacimiento
    public int dia;
    public int mes;
    public int año;
    public double altura; //en centimetros
    public double peso; // en kilogramas
    public int edad = 0;
    
    public PerfilMedico(String nombre, String apellido, String sexo, int dia, int mes, int año, double altura, double peso){
        this.altura = altura;
        this.apellido = apellido;
        this.año = año;
        this.dia = dia;
        this.mes = mes;
        this.nombre = nombre;
        this.peso = peso;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Apellido: " + apellido + ", Sexo: " + sexo + ", Dia: " + dia + ", Mes: " + mes +  ", Año: " + año + ", Altura: " + altura + ", Peso: " + peso;
    }
    
    
    
    public void CalcularEdad(int mes, int año){
        mes = this.mes;
        año = this.año;
        if(mes <= 8){
            this.edad = 2023 - año;
        }
        else{
            this.edad = 2022 - año;
        }
        System.out.println("La edad es: " + this.edad);
    }
    
    public void FMC(){
        double FMC;
        FMC = 208 - (0.7 * this.edad);
        System.out.println("La frecuencia cardiaca maxima es: "+FMC);
    }
    
    public void IMC(double peso, double altura){
        double IMC;
        IMC = this.peso/this.altura;
        System.out.println("El indice de masa corporal es: "+IMC);
    }
    
    
}