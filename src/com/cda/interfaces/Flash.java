package com.cda.interfaces;

public class Flash extends Personnage implements Competence{
    /*--------------
        Attributs
     ---------------*/
private int esquive;
    /*--------------
    Constructeurs
 ---------------*/
    public Flash(String nom, int attaque, int defense, int vie, int esquive) {
        super(nom, attaque, defense, vie);
        this.esquive = esquive;
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
    }
}
