package com.cda.classe;

public class Personnage {
    protected String nom;
    protected int vie;
    protected int attaque;
    protected int defense;

    //CONSTRUCTEUR
    public Personnage(){};
    public Personnage(String nom, int vie, int attaque, int defense){
        this.nom = nom;
        this.vie = vie;
        this.attaque = attaque;
        this.defense = defense;
    };

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

    //METHODE
    public void attaquer(Personnage cible){
        int hint = this.attaque - cible.defense;
        cible.setVie(cible.vie - hint);
    }
}
