package com.mycompany.l11.actv1;
import java.util.Objects;

public class Estudiante extends Persona{
    private String Especialidad;
    private Procedencia Procedencia;
    //verificacion por nombre y procedencia.
    
    public Estudiante (String Nombre, String Direccion, String Telefono, String Especialidad, Procedencia Procedencia){
        super(Nombre, Direccion,Telefono);
        this.Especialidad = Especialidad;
        this.Procedencia = Procedencia;
    }

    public String getEspecialidad() {
        return Especialidad;
    }

    public void setEspecialidad(String Especialidad) {
        this.Especialidad = Especialidad;
    }

    public Procedencia getProcedencia() {
        return Procedencia;
    }

    public void setProcedencia(Procedencia Procedencia) {
        this.Procedencia = Procedencia;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        Estudiante estudiante = (Estudiante) obj;
        return Objects.equals(Especialidad, estudiante.Especialidad) &&
               Objects.equals(Procedencia, estudiante.Procedencia);
    }
}
