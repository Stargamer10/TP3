/*
420-202 – TP3
Lien GIT Hub : https://github.com/Stargamer10/TP3
Nom : Fiset, Justin; 2235449
Nom : Gagnon, Xavier; 2237610
 */
package structures.pile;

public class NoeudPile {
    private Object element;
    private NoeudPile precedent;

    public NoeudPile(Object element) {
        this.element = element;
    }

    public NoeudPile(Object element, NoeudPile precedent) {
        this.element = element;
        this.precedent = precedent;
    }

    public Object getElement() {
        return element;
    }

    public void setElement(Object element) {
        this.element = element;
    }

    public NoeudPile getPrecedent() {
        return precedent;
    }

    public void setPrecedent(NoeudPile precedent) {
        this.precedent = precedent;
    }
}
