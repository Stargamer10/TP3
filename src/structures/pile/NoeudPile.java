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
