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

    public void setBonusAttaque(int bonusAttaque) {
        this.bonusAttaque = bonusAttaque;
    }
    //METHODE
    public void attaquer(Personnage cible){
        double chance = Math.random()*100;
        if (chance <=5){
            return cible.vie - (this.attaque + this.bonusAttaque - cible.defense);
        }else {
            return cible.vie - (this.attaque - cible.defense);
        }
    }
}
