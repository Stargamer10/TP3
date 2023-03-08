/*
420-202 – TP3
Lien GIT Hub : https://github.com/Stargamer10/TP3
Nom : Fiset, Justin; 2235449
Nom : Gagnon, Xavier; 2237610
 */
package cartes;

public enum ValeurCartes{
    V_AS("A", 1),
    V_2("2", 2),
    V_3("3", 3),
    V_4("4", 4),
    V_5("5", 5),
    V_6("6", 6),
    V_7("7", 7),
    V_8("8", 8),
    V_9("9", 9),
    V_10("10", 10),
    V_JACK("J", 11),
    V_QUEEN("Q", 12),
    V_KING("K", 13);

    private String symbole;
    private int valeur;

    ValeurCartes(String s, int i) {
        this.symbole = s;
        this.valeur = i;
    }

    public String getSymbole() {
        return symbole;
    }

    public int getValeur() {
        return valeur;
    }


    public String toString() {
        return symbole + " " + valeur;
    }
}
