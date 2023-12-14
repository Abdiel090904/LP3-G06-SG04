package com.mycompany.l11.ejer2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Dictionary<K, V> {
    private List<Pair<K, V>> pairs;

    public Dictionary() {
        this.pairs = new ArrayList<>();
    }

    public void add(K key, V value) {
        Pair<K, V> pair = new Pair<>(key, value);
        pairs.add(pair);
    }

    public boolean delete(K key) {
        Iterator<Pair<K, V>> iterator = pairs.iterator();
        while (iterator.hasNext()) {
            Pair<K, V> pair = iterator.next();
            if (pair.getKey().equals(key)) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    public V getValue(K key) throws ObjectNoExist {
        for (Pair<K, V> pair : pairs) {
            if (pair.getKey().equals(key)) {
                return pair.getValue();
            }
        }
        throw new ObjectNoExist("Key not found in dictionary");
    }

    public String toStringO() {
        return "Dictionary{" +
                "pairs=" + pairs +
                '}';
    }

    private static class Pair<K, V> {
        private K key;
        private V value;

        public Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        @Override
        public String toString() {
            return "(" + key + ", " + value + ")";
        }
    }
}

