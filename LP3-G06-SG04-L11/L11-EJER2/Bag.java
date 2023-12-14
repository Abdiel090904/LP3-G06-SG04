package com.mycompany.l11.ejer2;
import java.util.ArrayList;
import java.util.List;

public class Bag<T> {
    private List<T> objects;
    private int maxSize;

    public Bag(int maxSize) {
        this.maxSize = maxSize;
        this.objects = new ArrayList<>();
    }

    public void add(T obj) throws IsFullException {
        if (objects.size() < maxSize) {
            objects.add(obj);
        } else {
            throw new IsFullException("Bag is full");
        }
    }

    public boolean contains(T obj) {
        return objects.contains(obj);
    }

    public List<T> getObjects() {
        return objects;
    }

    @Override
    public String toString() {
        return "Bag{" +
                "objects=" + objects +
                '}';
    }
}

