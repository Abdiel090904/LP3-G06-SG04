package com.mycompany.l11.ejer2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CandyBags extends Bag<Goodies> {
    public CandyBags(int maxSize) {
        super(maxSize);
    }

    public Goodies cheapest() {
        if (getObjects().isEmpty()) {
            return null;
        }

        List<Goodies> allGoodies = new ArrayList<>(getObjects());
        Collections.sort(allGoodies, (g1, g2) -> Double.compare(g1.getPrice(), g2.getPrice()));

        return allGoodies.get(0);
    }

    public CandyBags mostExpensive(int n) {
        if (getObjects().isEmpty() || n <= 0) {
            return null;
        }

        List<Goodies> allGoodies = new ArrayList<>(getObjects());
        Collections.sort(allGoodies, (g1, g2) -> Double.compare(g2.getPrice(), g1.getPrice()));

        List<Goodies> expensiveGoodies = allGoodies.subList(0, Math.min(n, allGoodies.size()));
        CandyBags result = new CandyBags(expensiveGoodies.size());

        try {
            for (Goodies goodie : expensiveGoodies) {
                result.add(goodie);
            }
        } catch (IsFullException e) {
            e.printStackTrace(); // Handle appropriately in a real application
        }

        return result;
    }
}
