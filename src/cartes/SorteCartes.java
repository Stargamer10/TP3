/*
420-202 – TP3
Lien GIT Hub : https://github.com/Stargamer10/TP3
Nom : Fiset, Justin; 2235449
Nom : Gagnon, Xavier; 2237610
 */
package cartes;

import java.awt.Color;

public enum SorteCartes {
    COEUR('♥', Color.RED),
    CARREAU('♦', Color.RED),
    PIQUE('♠', Color.BLACK),
    TREFLE('♣', Color.BLACK);

    public Color couleur;
    public char symbole;

    SorteCartes(char s, Color c) {
        this.couleur = c;
        this.symbole = s;
    }

    public Color getCouleur() {
        return couleur;
    }

    public char getSymbole() {
        return symbole;
    }

    public String toString() {
        return symbole + " rouge:" + SorteCartes.COEUR.couleur.getRed() + " bleu:" + SorteCartes.COEUR.couleur.getBlue() + " vert:" + SorteCartes.COEUR.couleur.getGreen();
    }
}
