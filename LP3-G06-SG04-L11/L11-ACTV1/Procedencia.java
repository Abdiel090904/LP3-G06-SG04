package com.mycompany.l11.actv1;

import java.util.Objects;

public class Procedencia {
    private String Departamento;
    private String Provincia;

    public Procedencia(String Departamento, String Provincia) {
        this.Departamento = Departamento;
        this.Provincia = Provincia;
    }

    public String getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(String Departamento) {
        this.Departamento = Departamento;
    }

    public String getProvincia() {
        return Provincia;
    }

    public void setProvincia(String Provincia) {
        this.Provincia = Provincia;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Procedencia that = (Procedencia) obj;
        return Objects.equals(Departamento, that.Departamento) &&
               Objects.equals(Provincia, that.Provincia);
    }
}
