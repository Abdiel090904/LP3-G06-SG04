package com.mycompany.l11.actv4;
public class Chocolates extends Goodies {
    private boolean hasNuts;

    public Chocolates(int id, String description, float price, boolean hasNuts) {
        super(id, description, price);
        this.hasNuts = hasNuts;
    }

    public boolean isHasNuts() {
        return hasNuts;
    }

    public void setHasNuts(boolean hasNuts) {
        this.hasNuts = hasNuts;
    }
    
    @Override
    public String toString() {
        return "Chocolates{" + super.toString() + ", hasNuts=" + hasNuts + '}';
    }
}
