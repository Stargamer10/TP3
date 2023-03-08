package structures.pile;

public class Pile {
    private int taille;
    private NoeudPile sommet;

    public Object peek() {
        return sommet.getElement();
    }

    public int size() {
        return taille;
    }

    public Object pop() {
        Object r = peek();
        sommet = sommet.getPrecedent();
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
    }
}
