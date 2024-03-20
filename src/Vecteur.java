public class Vecteur {
    private int[] tableau;
    private int nbElements;

    public static final int RATIO_AGRANDISSEMENT = 2;
    public static final int TAILLE_INITIALE = 5;

    public Vecteur() {
        tableau = new int[TAILLE_INITIALE];
        nbElements = 0;
    }

    public String toString() {
        String str = "[";
        for (int i = 0; i < nbElements; i++)
            str += tableau[i] + ", ";
        return str + "]";
    }
    //méthodes d'accès sont mieux au début du code
    public int getNbElements(){
        return nbElements;
    }

    public int getElementAt(int index) {
        return tableau[index];
    }
    public boolean estVide () {
        return nbElements == 0;
    }
    public void ajouter(int valeur) {
        if (nbElements >= tableau.length)
            resize();
        tableau[nbElements++] = valeur;
    }
    public boolean ajouter(int valeur, int pIdx) {
            if (pIdx > nbElements) {
                return false;
            }

            if (nbElements >= tableau.length) {
                resize();
            }


            for (int i = nbElements; i > pIdx; i--) {
                tableau[i] = tableau[i - 1];
            }

            tableau[pIdx] = valeur;
            nbElements++;
            return true;
    }
    private void resize() {
        //agrandissement du tableau
        int[] nouvelleTaille = new int[tableau.length * RATIO_AGRANDISSEMENT];

        //boucle qui copie les autres éléments du tableau car quand on a
        //agrandit le tableau, on a supprimé les premières données
        for (int i = 0; i < nbElements; i++)
            nouvelleTaille[i] = tableau[i];
        tableau = nouvelleTaille;

    }
    public void ajouter(Vecteur autre) {
        for (int i = 0; i < autre.nbElements; i++)
        //this(moi-même, alors ma propre méthode ajouter)
        this.ajouter(autre.tableau[i]);
    }
    public int trouver(int item) {
        //parcourir le tableau pour trouver l'index
        for (int i = 0; i < tableau.length; i++)
            //est-ce que à mon tableau, la position ou je suis correspond à l'item?***/
            if (tableau[i] == item){
            //retourne la position où l'item est trouvé
                return i;
            }
        //si jamais la boucle a été traversée et l'item n'a été trouvé dans aucune des positions, retourne -1
            return -1;
    }
    public boolean trouverTout(Vecteur autre) {
        for (int i = 0; i < autre.getNbElements(); i++)
            if (this.trouver(autre.getElementAt(i)) == -1) {
                return false;
            }
            return true;

    }
    public void effaceTout() {
        nbElements = 0;
        System.out.println("Le vecteur est vide!!");
    }
    public boolean effacerAt(int index){
        //valider que l'index se trouve bien dans le Vecteur
        if (index < 0 || index > nbElements)
            return false;

        for (int i = index; i > nbElements; i++)
            tableau[i] = tableau [i + 1];
        nbElements--;
        return true;
    }
    public boolean effacerAll(Vecteur autre) {
        boolean modifier = false;
        for (int i = 0; i < autre.getNbElements(); i++) {
            int valeurChercheer = autre.getElementAt(i);
            int indexTrouver = this.trouver(valeurChercheer);
            if (indexTrouver != -1){
                effacerAt(indexTrouver);
                modifier = true;
            }
        }
        return modifier;
    }
    public boolean effacerTout(Vecteur autre) {
        boolean modifie = false;
        for (int i = 0; i < autre.getNbElements(); i++) {
            int valeurCherchee = autre.getElementAt(i);
            int indexTrouve = this.trouver(valeurCherchee);
            if (indexTrouve != -1){
                effacerAt(indexTrouve);
            modifie = true;
            }
        }
        return modifie;
    }
    public void effacerTout() {
        tableau = new int[TAILLE_INITIALE];
        nbElements = 0;
        /* effacerTout(this);*/
    }
}
