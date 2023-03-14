import cartes.Carte;
import cartes.SorteCartes;
import cartes.ValeurCartes;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarteTest {

    private static final Carte carte = new Carte(SorteCartes.COEUR, ValeurCartes.V_AS);

    @Test
    void testToString_LesProprietesSontAfficheesDeFaconComprehensible() {
        Object expected = "Carte{" +
                "sorte symbole=" + SorteCartes.COEUR.symbole +
                ", sorte couleur= rouge:" + SorteCartes.COEUR.couleur.getRed() + " bleu:" + SorteCartes.COEUR.couleur.getBlue()+ " vert:" + SorteCartes.COEUR.couleur.getGreen() +
                ", valeur symbole=" + ValeurCartes.V_AS.getSymbole() +
                ", valeur valeur=" + ValeurCartes.V_AS.getValeur() +
                ", visible=" + false +
                '}';
        Object actual = carte.toString();
        assertEquals(expected, actual);
    }

    @Test
    void toStringCarte_AfficheLaSorteEtLaValeurDeFaconConcise() {
        //Invisible avant d'être tournée
        Object expected = "I";
        Object actual = carte.toStringCarte();
        assertEquals(expected, actual);

        carte.setVisible(true);
        expected = "♥ A";
        actual = carte.toStringCarte();
        assertEquals(expected, actual);
    }

    @Test
    void testEquals_DeuxCartesSontEgalesSiEllesSontVisiblesDeLaMemeSorteEtDeLaMemeValeur() {
        carte.setVisible(false);
        Carte c2 = new Carte(SorteCartes.COEUR, ValeurCartes.V_AS);
        assertFalse(carte.equals(c2));

        c2.setVisible(true);
        carte.setVisible(true);
        assertTrue(carte.equals(c2));

        c2 = new Carte(SorteCartes.CARREAU, ValeurCartes.V_AS);
        assertFalse(carte.equals(c2));

        c2 = new Carte(SorteCartes.COEUR, ValeurCartes.V_10);
        assertFalse(carte.equals(c2));
    }

    @Test
    void compareTo() {
        carte.setVisible(true);
        Carte c2 = new Carte(SorteCartes.COEUR, ValeurCartes.V_AS);
        c2.setVisible(true);

        assertTrue(carte.compareTo(c2) == 0);

        c2 = new Carte(SorteCartes.COEUR, ValeurCartes.V_2);
        assertTrue(carte.compareTo(c2) < 0);

        c2 = new Carte(SorteCartes.CARREAU, ValeurCartes.V_AS);
        assertTrue(carte.compareTo(c2) < 0);
    }
}