package com.mycompany.l11.mrctrc1;
public class L11MRCTRC1 {

    public static void main(String[] args) {
        Box<Integer> boxInt = new Box<Integer>(10);
        Box<Double> boxDou = new Box<Double>(39.5);
        Box<String> boxStr = new Box<>("Ministerio de Educacion");
        System.out.println("Caja de enteros: " + boxInt);
        System.out.println("Caja de doubles: " + boxDou);
        System.out.println("Caja de cadenas: " + boxStr);
        
    }
}
