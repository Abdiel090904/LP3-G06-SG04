
public class Datos {
    private String sexo;
    private String trabajo;
    private int sueldo;
    
    public Datos(String sexo, String trabajo, int sueldo) {
        this.sexo = sexo;
        this.trabajo = trabajo;
        this.sueldo = sueldo;
    }
    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setTrabajo(String trabajo) {
        this.trabajo = trabajo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public String getTrabajo() {
        return trabajo;
    }

    public int getSueldo() {
        return sueldo;
    }
    @Override
    public String toString() {
        return "Sexo: " + sexo + ", Trabajo: " + trabajo + ", Sueldo: " + sueldo;
    }
}
