/*
420-202 – TP3
Lien GIT Hub : https://github.com/Stargamer10/TP3
Nom : Fiset, Justin; 2235449
Nom : Gagnon, Xavier; 2237610
 */
package cartes;

import exceptions.ConstructeurException;

import java.util.ArrayList;

public class PaquetDeCartes {
    public static final int NBR_ECHANGE = 100;

    private ArrayList<Carte> paquet;

    public PaquetDeCartes(ArrayList<Carte> paquet) {
        if(paquet != null)
            this.paquet = paquet;
        else
            throw new ConstructeurException("Un paquet reçu en argument ne peut pas être vide");
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
        Carte carteA = paquet.get(posA);
        Carte carteB = paquet.get(posB);

        paquet.set(posA, carteA);
        paquet.set(posB, carteB);
    }

    public Carte prendreCarte( int position) {
        return paquet.remove(position);
    }

    public void retournerTouteLesCartes(boolean visible) {
        for (int i = 0; i < paquet.size() - 1; i++) {
            paquet.get(i).setVisible(visible);
        }
    }

    public int size() {
        return paquet.size();
    }

    private boolean validerPosition(int position) {
        return 0 <= position && position <= paquet.size() - 1;
    }
}
