package com.mycompany.l11.actv4;
public class Sweet extends Biscuits {
    private String sweetType;

    public Sweet(int id, String description, float price, String flavor, String sweetType) {
        super(id, description, price, flavor);
        this.sweetType = sweetType;
    }

    public String getSweetType() {
        return sweetType;
    }

    public void setSweetType(String sweetType) {
        this.sweetType = sweetType;
    }

    @Override
    public String toString() {
        return "Sweet{" + super.toString() + ", sweetType='" + sweetType + "'}";
    }
}
