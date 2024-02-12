package com.cda.classe;

public class Partie {
    private Personnage joueur1;
    private Personnage joueur2;
    private int nbTour;
    //Constructeur
    public Partie(Personnage joueur1, Personnage joueur2, int nbTour) {
        this.joueur1 = joueur1;
        this.joueur2 = joueur2;
        this.nbTour = nbTour;
    }
    //GETTER ET SETTER

    public Personnage getJoueur1() {
        return joueur1;
    }

    public void setJoueur1(Personnage joueur1) {
        this.joueur1 = joueur1;
    }

    public Personnage getJoueur2() {
        return joueur2;
    }

    public void setJoueur2(Personnage joueur2) {
        this.joueur2 = joueur2;
    }

    public int getNbTour() {
        return nbTour;
    }

    public void setNbTour(int nbTour) {
        this.nbTour = nbTour;
    }

    //METHODE
    public String lancerPartie(){
        while(nbTour > 0){
            joueur1.attaquer(joueur2);
            joueur2.attaquer(joueur1);
            nbTour -= 1 ;
        }
        if (joueur1.vie <= 0 && joueur2.vie > 0){
            return "Le gagnant est " + joueur2.getNom();
        } else if (joueur2.vie <= 0 && joueur1.vie > 0) {
            return "Le gagnant est " + joueur1.getNom();
        } else if (joueur1.vie <= 0 && joueur2.vie <= 0) {
            return "égalité";
        }
//        else if (joueur1.vie > 0 && joueur2.vie > 0) {
//            return "égalité";
//        }
            else {
            return "égalité";
        }
    }
}
