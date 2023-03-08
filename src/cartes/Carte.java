/*
420-202 – TP3
Lien GIT Hub : https://github.com/Stargamer10/TP3
Nom : Fiset, Justin; 2235449
Nom : Gagnon, Xavier; 2237610
 */
package cartes;

public class Carte implements Comparable<Carte> {
    static final char IMAGE_DOS = 'I';

    private SorteCartes sorte;
    private ValeurCartes valeur;
    private boolean visible;

    public Carte(SorteCartes sorte, ValeurCartes valeur) {
        this.sorte = sorte;
        this.valeur = valeur;
    }

    public boolean estVisible() {
        return visible;
    }

    public SorteCartes getSorte() {
        return sorte;
    }

    public char getSorteSymbol() {
        return sorte.getSymbole();
    }

    public ValeurCartes getValeur() {
        return valeur;
    }

    public String getValeurSymbol() {
        return valeur.getSymbole();
    }

    private void setSorte(SorteCartes sorte) {
        this.sorte = sorte;
    }

    private void setValeur(ValeurCartes valeur) {
        this.valeur = valeur;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    @Override
    public String toString() {
        return "Carte{" +
                "sorte=" + sorte +
                ", valeur=" + valeur +
                ", visible=" + visible +
                '}';
    }

    public String toStringCarte() {
        if (visible) {
            return sorte.toString() + " " + valeur.toString();
        } else {
            return String.valueOf(IMAGE_DOS);
        }
    }

    @Override
    public int compareTo(Carte o) {
        return 0;
    }
}
