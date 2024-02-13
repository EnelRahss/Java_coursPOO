package com.cda.interfaces;

public class Superman extends Personnage implements Competence{
        /*--------------
        Attributs
     ---------------*/
private int bonusAttaque;
    /*--------------
    Constructeurs
 ---------------*/
    public Superman(String nom, int attaque, int defense, int vie, int bonusAttaque) {
        super(nom, attaque, defense, vie);
        this.bonusAttaque = bonusAttaque;
    }


    /*--------------
        Getter et Setter
     ---------------*/

    /*--------------
        Methodes
    ---------------*/
    @Override
    public void attaquer(Personnage cible) {
        double chance = Math.random() * 100;
        if (chance < 50){
            cible.setVie(cible.getVie() + cible.getDefense() - this.getAttaque());
        }
        if (chance >= 50){
            cible.setVie(cible.getVie() + cible.getDefense() - this.getAttaque() + this.bonusAttaque);
        }
    }
}
