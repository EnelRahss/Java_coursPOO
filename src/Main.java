import com.cda.classe.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//            Exemple test = new Exemple();
//            Exemple test2 = new Exemple("Sharlène", "Fleury");
//            System.out.println(test2.name + "\n" + test2.firstname);
//            Exemple test3 = test;

            //Exercice 1
//        Habitation cabane = new Habitation("cabane", 3,2);
//        Habitation maison = new Habitation("maison", 20,5);
//        Habitation appartement = new Habitation("studio", 6,3);
//        System.out.println("L'habitation : " + cabane.getNom() + " a une surface de : " + cabane.surface() + "m².");
//        System.out.println("L'habitation : " + maison.getNom() + " a une surface de : " + maison.surface() + "m².");
//        System.out.println("L'habitation : " + appartement.getNom() + " a une surface de : " + appartement.surface() + "m².");
//
            //Exercice 2
//        Habitation cabane = new Habitation("cabane", 3,2,1);
//        Habitation maison = new Habitation("villa", 20,5,2);
//        Habitation immeuble = new Habitation("studios", 6,3,6);
//        System.out.println("L'habitation : " + cabane.getNom() + " a une surface de : " + cabane.surface() + "m².");
//        System.out.println("L'habitation : " + maison.getNom() + " a une surface de : " + maison.surface() + "m².");
//        System.out.println("L'habitation : " + immeuble.getNom() + " a une surface de : " + immeuble.surface() + "m².");
//
            //Exercice 3
//        Vehicule tracteur = new Vehicule("tracteur", 4, 50);
//        Vehicule velo = new Vehicule("bicyclette", 2, 15);
//        Vehicule camion = new Vehicule("kamtar", 6,90);
//
//        System.out.println("Le véhicule : " + tracteur.getNom() + " est de type " + tracteur.detect());
//        System.out.println("Le véhicule : " + velo.getNom() + "  est de type " + velo.detect());
//        System.out.println("Le véhicule : " + camion.getNom() + "  est de type " + camion.detect());
//
//        tracteur.boost();
//        velo.boost();
//        camion.boost();
//
//        System.out.println("Le véhicule : " + tracteur.getNom() + " possède une vitesse de : " + tracteur.getVitesse() + "k/h");
//        System.out.println("Le véhicule : " + velo.getNom() + " possède une vitesse de : " + velo.getVitesse() + "k/h");
//        System.out.println("Le véhicule : " + camion.getNom() + " possède une vitesse de : " + camion.getVitesse() + "k/h");
//
//        //Exercice 4
//        System.out.println("Le véhicule le plus rapide est " + tracteur.plusRapide(velo));
//        System.out.println("Le véhicule le plus rapide est " + velo.plusRapide(camion));
//        System.out.println("Le véhicule le plus rapide est " + camion.plusRapide(tracteur));

        Assassin patrick = new Assassin("Patrick le bg", 40, 20,10,40);
        Guerrier maeva = new Guerrier("Maeva la rebelle", 50,20,8,10);

        Partie partie1 = new Partie(patrick, maeva,3);
        System.out.println(partie1.lancerPartie());

        Guerrier eva = new Guerrier("Eva la forte", 30,17,10,10);

        Partie partie2 = new Partie(eva, patrick,2);
        System.out.println(partie2.lancerPartie());


    }
}