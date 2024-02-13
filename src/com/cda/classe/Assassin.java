package com.cda.classe;

public class Assassin extends Personnage{
    private int bonusAttaque;
    public Assassin(String nom, int vie, int attaque, int defense, int bonusAttaque){
        super(nom, vie, attaque, defense);
        this.bonusAttaque = bonusAttaque;
    }
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getVie() {
        return vie;
    }

    public void setVie(int vie) {
        this.vie = vie;
    }

    public int getAttaque() {
        return attaque;
    }

    public void setAttaque(int attaque) {
        this.attaque = attaque;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }
    public int getBonusAttaque() {

        return bonusAttaque;
    }

    public void setBonusAttaque(int value) {

        this.bonusAttaque = value;
    }
    //METHODE
    public void attaquer(Personnage cible){
        double chance = Math.random()*100;
        if (chance <=20){
            int hint = this.attaque + this.bonusAttaque - cible.defense;
            cible.setVie(cible.vie - hint);
        }else {
            int hint = this.attaque - cible.defense;
            cible.setVie(cible.vie - hint);
        }
    }
}
//        int hint = this.attaque - cible.defense;
//        cible.setVie(cible.vie - hint);
