package com.mycompany.l11.ejer2;
public class Goodies {
    private String name;
    private double price;

    public Goodies(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Goodies goodies = (Goodies) obj;
        return name.equals(goodies.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public String toString() {
        return name + " ($" + price + ")";
    }
}
