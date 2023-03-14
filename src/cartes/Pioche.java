/*
420-202 – TP3
Lien GIT Hub : https://github.com/Stargamer10/TP3
Nom : Fiset, Justin; 2235449
Nom : Gagnon, Xavier; 2237610
 */
package cartes;

import structures.pile.Pile;

public class Pioche {
    private Pile pioche;

    public Pioche(PaquetDeCartes paquet) {
        pioche = new Pile();
        for (int i = 0; i < paquet.size(); i++) {
            pioche.push(paquet.consulterCarte(i));
        }
    }

    public Carte piger() {
        return (Carte) pioche.pop();
    }

    public boolean isEmpty() {
        return pioche.empty();
    }

    public String consulterDessus() {
        return ((Carte) pioche.peek()).toStringCarte();
    }

    public int size() {
        return pioche.size();
    }
}
