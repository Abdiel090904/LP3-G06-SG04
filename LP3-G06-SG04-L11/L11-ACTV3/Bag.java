// Clase Bag
package com.mycompany.l11.actv3;

import java.util.ArrayList;
import java.util.List;

public class Bag<T> {
    private List<T> list;

    public Bag() {
        this.list = new ArrayList<>();
    }

    public void add(T obj) {
        list.add(obj);
    }

    public List<T> getObjects() {
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

    @Override
    public String toString() {
        return list.toString();
    }
}
