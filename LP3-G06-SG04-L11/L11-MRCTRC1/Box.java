package com.mycompany.l11.mrctrc1;

public class Box<T> {
    private T item;
    
    public Box(T item) {
        this.item = item;
    }
    
    public T getItem() {
        return this.item;
    }
    
    public void setItem(T item) {
        this.item = item;
    }
    
    @Override
    public String toString() {
        return String.valueOf(this.item);
    }
}
