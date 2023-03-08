/*
420-202 – TP3
Lien GIT Hub : https://github.com/Stargamer10/TP3
Nom : Fiset, Justin; 2235449
Nom : Gagnon, Xavier; 2237610
 */
package cartes;

import java.util.ArrayList;
import java.util.List;

public class PaquetDeCartes {
    public static final int NBR_ECHANGE = 100;

    private ArrayList<Carte> paquet;

    public PaquetDeCartes(ArrayList<Carte> paquet) {
        this.paquet = paquet;
    }

    public PaquetDeCartes() {
        paquet = new ArrayList<Carte>();

        for(SorteCartes sorte : SorteCartes.values()) {
            for(ValeurCartes valeur : ValeurCartes.values()) {
                paquet.add(new Carte(sorte, valeur));
            }
        }
    }

    public void brasser() {

    }

    public Carte consulterCarte(int position) {
        return paquet.get(position);
    }

    public boolean isEmpty() {
        return paquet.isEmpty();
    }

    private void permuterCartE(int posA, int posB) {

    }

    public Carte prendreCarte() {
        return new Carte(SorteCartes.CARREAU, ValeurCartes.V_10); // ***** A CHANGER ********
    }

    public void retournerTouteLesCartes(boolean valeur) {

    }

    public int size() {
        return paquet.size();
    }

    private boolean validerPosition(int position) {
        return true; // ****** À CHANGER *******
    }
}
