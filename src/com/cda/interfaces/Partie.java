package com.cda.interfaces;

public class Partie {
        /*--------------
        Attributs
     ---------------*/
    private Personnage perso1;
    private Personnage perso2;
    private int nbTour;

            /*--------------
        Constructeurs
     ---------------*/
    public Partie(Personnage perso1, Personnage perso2, int nbTour) {
        this.perso1 = perso1;
        this.perso2 = perso2;
        this.nbTour = nbTour;
    }
    /*--------------
        Getter et Setter
     ---------------*/

    public Personnage getPerso1() {
        return perso1;
    }

    public void setPerso1(Personnage perso1) {
        this.perso1 = perso1;
    }

    public Personnage getPerso2() {
        return perso2;
    }

    public void setPerso2(Personnage perso2) {
        this.perso2 = perso2;
    }

    public int getNbTour() {
        return nbTour;
    }

    public void setNbTour(int nbTour) {
        this.nbTour = nbTour;
    }
    /*--------------
        Methode
     ---------------*/
public String lancerPartie(){
    String message = "";
    while(this.nbTour > 0){
        this.perso1.attaquer(this.perso2);
        if(this.perso2.getVie() < 0){
            message = "Le personnage " + this.perso1.getNom() + " a gagné !";
            this.nbTour = 0;
        }
        this.perso2.attaquer(this.perso1);
        if(this.perso1.getVie()<0){
            message = "Le personnage " + this.perso2.getNom() + " a gagné !";
            this.nbTour = 0;
        }
        this.nbTour--;
    }
    if(this.perso1.getVie() > 0 && this.perso2.getVie() > 0){
        message = "Egalité";
    }
    if(this.perso1.getVie() < 0 && this.perso2.getVie() < 0){
        message = "Les deux sont morts";
    }
    return message;
}
}
