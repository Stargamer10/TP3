/*
420-202 – Quiz 4
Groupe 1 (lundi, mercredi)
Nom : Fiset, Justin; 2235449
 */

import exceptions.PileException;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import structures.pile.Pile;

import static org.junit.jupiter.api.Assertions.*;

class PileTest {
    private static final Object[] tabObj = new Object[5];

    @BeforeAll
    public static void creeTableauObjet() {
        for (int i = 0; i < tabObj.length; i++) {
            tabObj[i] = new Object();
        }
    }

    @Test
    void constructeur_creeUnePileVide() {
        Pile pile = new Pile();
        assertEquals(0, pile.size());
        assertThrows(PileException.class, () -> pile.peek());
        assertThrows(PileException.class, () -> pile.pop());
    }

    @Test
    void empty_retourneLaBonneValeurSiVide() {
        Pile pile = new Pile();

        for (Object o : tabObj) {
            pile.push(o);
        }

        try {
            for (int i = 0; i < tabObj.length; i++) {
                assertFalse(pile.empty()); // La pile se considère-t-elle vide avant de l'être?
                pile.pop();
            }
        } catch (IndexOutOfBoundsException e) {
            fail("La pile ne stocke pas les objets correctement");
        }

        // On vérifie si la pile est vide quand elle l'est
        assertTrue(pile.empty());
    }

    @Test
    void peek_RetourneLeBonObjet() {
        Object expected;
        Object actual;

        Pile pile = new Pile();
        assertThrows(PileException.class, () -> pile.peek());
        for (Object o : tabObj) {
            expected = o;
            pile.push(expected);
            actual = pile.peek();
            assertEquals(expected, actual);
        }
    }

    @Test
    void pop_EnleveLeBonObjet() {
        Object expected;
        Object actual;

        Pile pile = new Pile();

        for (Object o : tabObj) {
            pile.push(o);
        }

        try {
            for (int i = 0; i < tabObj.length; i++) {
                actual = pile.pop();
                if (i > 0) {
                    // La valeur retournée par pop() est-elle la bonne valeur?
                    expected = tabObj[(tabObj.length - 1) - i];
                    assertEquals(expected, actual);
                }
            }
        } catch (IndexOutOfBoundsException e) {
            fail("La pile ne stocke pas les objets correctement");
        }
    }

    @Test
    void size_RetourneLaBonneTaille() {
        int expected;
        int actual;

        // Une liste remplie possède-t-elle la bonne longueur?
        Pile pile = new Pile();
        for (int i = 0; i < tabObj.length; i++) {
            pile.push(tabObj[i]);
            expected = i + 1;
            actual = pile.size();
            assertEquals(expected, actual);
        }

        // Une liste vide à elle une longueur de 0?
        pile = new Pile();
        expected = 0;
        actual = pile.size();
        assertEquals(expected, actual);
    }
}