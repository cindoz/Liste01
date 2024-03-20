//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Test 1: Ajout de valeurs dans le vecteur.");
        Liste data = new Liste();
        data.ajouter(0);
        data.ajouter(10);
        data.ajouter(20);
        System.out.println(data);

        System.out.println("Test 2: Agrandir le vecteur quand il est plein.");
        data.ajouter(30);
        data.ajouter(40);
        //index 6
        data.ajouter(60);
        System.out.println(data);

        System.out.println("Test 3: Ajouter des valeurs à des index spécifiques.");
        //index 7
        data.ajouter(-10, 0);
        //index 8
        data.ajouter(35, 4);
        //index 9
        data.ajouter(90, 8);
        System.out.println(data);

        System.out.println("Test 4: Ajouter des valeurs provenant d'un autre vecteur");
        Liste v2 = new Liste();
        v2.ajouter(1);
        v2.ajouter(2);
        v2.ajouter(3);
        data.ajouter(v2);
        v2.trouver(5);
        System.out.println(data);

        System.out.println("Test 5: Ajouter des valeurs provenant d'un autre vecteur (vide)");
        Liste v3 = new Liste();
        data.ajouter(v3);
        System.out.println(data);
        System.out.println(data.getNbElements());

        System.out.println("Test 6: Valider les valeurs présentes dans le vecteur.");
        System.out.println(data.getElementAt(0));
        System.out.println(data.getElementAt(6));
        System.out.println(data.getElementAt(11));

        System.out.println("Test 7: Valider les valeurs présentes dans le vecteur.");
        System.out.println(data.trouver(4));
        System.out.println(data.trouver(10));
        System.out.println(data.trouver(2));

        System.out.println("Test 8: Trouver toutes les valeurs d'un autre vecteur");
        Liste test8 = new Liste();
        test8.ajouter(-10);
        test8.ajouter(40);
        test8.ajouter(1);
        System.out.println(data.trouverTout(test8));

        test8.ajouter(31);
        System.out.println(data.trouverTout(test8));

        System.out.println("Test 9: Effacer une valeur à une position spécifique dans le vecteur");
        data.effacerAt(0);
        data.effacerAt(4);
       // on tente d'effacer à la fin alors l'index sera le nb d'éléments (on fait -1 car index commence à 0)
        data.effacerAt(data.getNbElements() -1);
        System.out.println(data);
        System.out.println(data.getNbElements());

        System.out.println("Test 10: Supprimer valeurs d'un autre vecteur");
        Liste test9 = new Liste();
        test9.ajouter(0);
        test9.ajouter(5);
        test9.ajouter(60);
        test9.ajouter(30);
        test9.ajouter(40);
        test9.ajouter(80);
        test9.effacerTout(test9);
        System.out.println(data);
        System.out.println(data.getNbElements());

        System.out.println("Test 11: Effacer tout");
        data.effacerTout();
        System.out.println(data);
        System.out.println(data.getNbElements());

    }


}