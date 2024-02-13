package com.cda.classe;

public class Guerrier extends Personnage {
    private int bonusDefense;

    public Guerrier(String nom, int vie, int attaque, int defense, int bonusDefense) {
        super(nom, vie, attaque, defense);
        this.bonusDefense = bonusDefense;
    }

    //GETTER ET SETTER
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

    public int getBonusDefense() {
        return bonusDefense;
    }

    public void setBonusDefense(int bonusDefense) {
        this.bonusDefense = bonusDefense;
    }

    public void attaquer(Personnage cible) {
        double chance = Math.random() * 100;
        if (chance <= 5) {
            int hint = this.attaque + this.bonusDefense - cible.defense;
            cible.setVie(cible.vie - hint);
        } else {
            int hint = this.attaque - cible.defense;
            cible.setVie(cible.vie - hint);
        }
    }
}
