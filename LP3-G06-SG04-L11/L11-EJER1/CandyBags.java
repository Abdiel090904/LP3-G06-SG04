package com.mycompany.l11.ejer1;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CandyBags extends Bag<Goodies> {

    public CandyBags(int n) {
        super(n);
    }

    @Override
    public void add(Goodies obj) throws IsFullException {
        try {
            if (!contains(obj)) {
                super.add(obj);
            }
        } catch (IsEmptyException ex) {
            Logger.getLogger(CandyBags.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Goodies cheapest() throws IsEmptyException {
        if (isEmpty()) {
            throw new IsEmptyException("La bolsa de golosinas está vacía.");
        }

        Goodies cheapestGoodie = getObjects().get(0);

        for (Goodies goodie : getObjects()) {
            if (goodie.getPrice() < cheapestGoodie.getPrice()) {
                cheapestGoodie = goodie;
            }
        }

        return cheapestGoodie;
    }

    public CandyBags mostExpensive(int n) throws IsEmptyException {
        if (isEmpty() || n <= 0) {
            return new CandyBags(0);
        }

        List<Goodies> allGoodies = new ArrayList<>(getObjects());
        allGoodies.sort((g1, g2) -> Double.compare(g2.getPrice(), g1.getPrice()));

        int numToCopy = Math.min(n, allGoodies.size());

        CandyBags result = new CandyBags(numToCopy);
        for (int i = 0; i < numToCopy; i++) {
            result.getObjects().add(allGoodies.get(i));
        }

        return result;
    }

    private boolean contains(Goodies obj) throws IsEmptyException {
        for (Goodies goodie : getObjects()) {
            if (goodie.equals(obj)) {
                return true;
            }
        }
        return false;
    }
}
