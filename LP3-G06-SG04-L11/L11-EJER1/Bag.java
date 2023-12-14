package com.mycompany.l11.ejer1;

import java.util.ArrayList;
import java.util.List;

public class Bag<T> {
    private List<T> list;
    private int count;

    public Bag(int n) {
        this.list = new ArrayList<>(n);
        this.count = 0;
    }

    public void add(T obj) throws IsFullException {
        if (count < list.size()) {
            list.add(obj);
            count++;
        } else {
            throw new IsFullException("La bolsa está llena. No se puede agregar más elementos.");
        }
    }

    public List<T> getObjects() throws IsEmptyException {
        if (isEmpty()) {
            throw new IsEmptyException("La bolsa está vacía.");
        }
        return new ArrayList<>(list);
    }

    public T remove(T obj) throws ObjectNoExistException {
        int index = getIndex(obj);
        if (index != -1) {
            return list.remove(index);
        } else {
            throw new ObjectNoExistException("El objeto no existe en la bolsa.");
        }
    }

    public int getIndex(T obj) {
        return list.indexOf(obj);
    }

    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public String toString() {
        return list.toString();
    }
}
