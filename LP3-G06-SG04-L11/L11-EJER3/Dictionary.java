package com.mycompany.l11.ejer3;
import java.util.ArrayList;

public class Dictionary<K, V> {
    private ArrayList<Pair<K, V>> dictionary;

    public Dictionary() {
        this.dictionary = new ArrayList<>();
    }

    public void add(K key, V value) {
        dictionary.add(new Pair<>(key, value));
    }

    public boolean delete(K key) {
        for (Pair<K, V> pair : dictionary) {
            if (pair.getKey().equals(key)) {
                dictionary.remove(pair);
                return true;
            }
        }
        return false;
    }

    public V getValue(K key) throws ObjectNoExistException {
        for (Pair<K, V> pair : dictionary) {
            if (pair.getKey().equals(key)) {
                return pair.getValue();
            }
        }
        throw new ObjectNoExistException("Object not found");
    }

    public String toStringO() {
        StringBuilder result = new StringBuilder();
        for (Pair<K, V> pair : dictionary) {
            result.append(pair).append("\n");
        }
        return result.toString();
    }
}

