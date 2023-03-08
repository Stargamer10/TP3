package structures.pile;

import exceptions.PileException;

public class Pile {
    private int taille;
    private NoeudPile sommet;

    public Object peek() {
        if (empty()) {
            throw new PileException("Le pile est vide - Vous ne pouvez pas reguarder la valeuur");
        }

        return sommet.getElement();
    }

    public int size() {
        return taille;
    }

    public Object pop() {
        if (empty()) {
            throw new PileException("Le pile est vide - Vous ne pouvez pas enlever une valeur");
        }

        Object r = peek();
        sommet = sommet.getPrecedent();
        taille--;
        return r;
    }

    public boolean empty() {
        return sommet == null;
    }

    public void psuh(Object obj) {
        if (empty()) {
            sommet = new NoeudPile(obj);
        } else {
            sommet = new NoeudPile(obj, sommet);
        }

        taille++;
    }
}
