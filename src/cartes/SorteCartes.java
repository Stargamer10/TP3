package cartes;

import java.awt.Color;

public enum SorteCartes {
    COEUR('♥', Color.RED),
    CARREAU('\u2666', Color.RED),
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
        return symbole + " " + couleur;
    }
}
