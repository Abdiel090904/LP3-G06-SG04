package com.mycompany.l11.actv1;
public class Goodies {
    private int Id;
    private String Desciption;
    private float Price;

    public Goodies(int Id, String Desciption, float Price) {
        this.Id = Id;
        this.Desciption = Desciption;
        this.Price = Price;
    }
    
    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getDesciption() {
        return Desciption;
    }

    public void setDesciption(String Desciption) {
        this.Desciption = Desciption;
    }

    public float getPrice() {
        return Price;
    }

    public void setPrice(float Price) {
        this.Price = Price;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Goodies goodies = (Goodies) obj;
        return Id == goodies.Id;
    }
}
