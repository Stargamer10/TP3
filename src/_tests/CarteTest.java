import cartes.Carte;
import cartes.SorteCartes;
import cartes.ValeurCartes;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarteTest {

    private static final Carte carte = new Carte(SorteCartes.COEUR, ValeurCartes.V_AS);

    @Test
    void testToString_LesProprietesSontCorrectementAssigneesEtComprenables() {
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
        expected = SorteCartes.COEUR.symbole +
                " rouge:" + SorteCartes.COEUR.couleur.getRed() +
                " bleu:" + SorteCartes.COEUR.couleur.getBlue()+
                " vert:" + SorteCartes.COEUR.couleur.getGreen() +
                ", " + ValeurCartes.V_AS.getSymbole() +
                " " + ValeurCartes.V_AS.getValeur();
        actual = carte.toStringCarte();
        assertEquals(expected, actual);
    }

    @Test
    void testEquals() {
    }

    @Test
    void compareTo() {
    }
}