package com.cda.interfaces;
import com.cda.interfaces.*;

public class Batman extends Personnage implements Competence{

/*--------------
        Attributs
     ---------------*/
private int bonusDefense;
    /*--------------
    Constructeurs
 ---------------*/
    public Batman(String nom, int attaque, int defense, int vie, int bonusDefense) {
    super(nom, attaque, defense, vie);
    this.bonusDefense = bonusDefense;
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
            this.setVie(this.getVie() + this.bonusDefense  );}
    }

}
