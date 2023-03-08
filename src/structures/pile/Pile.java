/*
420-202 – TP3
Lien GIT Hub : https://github.com/Stargamer10/TP3
Nom : Fiset, Justin; 2235449
Nom : Gagnon, Xavier; 2237610
 */
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

    public void push(Object obj) {
        if (empty()) {
            sommet = new NoeudPile(obj);
        } else {
            sommet = new NoeudPile(obj, sommet);
        }

        taille++;
    }
}
