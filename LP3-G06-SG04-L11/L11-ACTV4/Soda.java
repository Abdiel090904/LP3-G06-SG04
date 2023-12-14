package com.mycompany.l11.actv4;
// Clase Soda (Clase Hija de Biscuits)
public class Soda extends Biscuits {
    private String sodaType;

    public Soda(int id, String description, float price, String flavor, String sodaType) {
        super(id, description, price, flavor);
        this.sodaType = sodaType;
    }

    public String getSodaType() {
        return sodaType;
    }

    public void setSodaType(String sodaType) {
        this.sodaType = sodaType;
    }
    
    @Override
    public String toString() {
        return "Soda{" + super.toString() + ", sodaType='" + sodaType + "'}";
    }
}
