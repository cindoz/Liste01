import static org.junit.jupiter.api.Assertions.*;
/**Comment Faire?
 Sélectionner une méthode d'accès comme getNbElements > Generate > Test > Message d'erreur > ok > accepter nom > cocher tout > ok
 **/
class ListeTest {

    @org.junit.jupiter.api.Test
    void getNbElements() {
        //Tester trois cas spéciaux, le cas ou il y en a aucun, le cas ou il y en a un seule et le cas ou il y en a deux
        Liste test = new Liste();
        assertEquals(0, test.getNbElements());

        test.ajouter(0);
        assertEquals(1, test.getNbElements());

        test.ajouter(0);
        assertEquals(2, test.getNbElements());
    }

    @org.junit.jupiter.api.Test
    void getElementAt() {
    }

    @org.junit.jupiter.api.Test
    void estVide() {
    }

    @org.junit.jupiter.api.Test
    void ajouter() {
    }

    @org.junit.jupiter.api.Test
    void testAjouter() {
    }

    @org.junit.jupiter.api.Test
    void testAjouter1() {
    }

    @org.junit.jupiter.api.Test
    void trouver() {
    }

    @org.junit.jupiter.api.Test
    void trouverTout() {
    }

    @org.junit.jupiter.api.Test
    void effaceTout() {
    }

    @org.junit.jupiter.api.Test
    void effacerAt() {
    }

    @org.junit.jupiter.api.Test
    void effacerTout() {
    }

    @org.junit.jupiter.api.Test
    void testEffacerTout() {
    }
}