package cartes;

import structures.pile.Pile;

public class Pioche {
    private Pile pioche;

    public Pioche(PaquetDeCartes paquet) {
        for (int i = 0; i < paquet.size(); i++) {
            pioche.push(paquet.consulterCarte(i));
        }
    }

    public Carte piger() {
        return (Carte) pioche.pop();
    }

    public boolean isEmpty() {
        return  pioche.empty();
    }

    public String consulterDessus() {
        return ((Carte) pioche.peek()).toString();
    }

    public int size() {
        return pioche.size();
    }
}
