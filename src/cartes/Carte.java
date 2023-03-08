/*
420-202 – TP3
Lien GIT Hub : https://github.com/Stargamer10/TP3
Nom : Fiset, Justin; 2235449
Nom : Gagnon, Xavier; 2237610
 */
package cartes;

public class Carte {
    static final char IMAGE_DOS = 'I';

    private SorteCartes sorte;
    private ValeurCartes valeur;
    private boolean visible;

    public Carte(SorteCartes sorte, ValeurCartes valeur) {
        this.sorte = sorte;
        this.valeur = valeur;
    }

}
