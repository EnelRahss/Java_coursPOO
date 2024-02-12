package com.cda.classe;

public class Personnage {
    private String nom;
    private int vie;
    private int attaque;
    private int defense;

    //CONSTRUCTEUR
    public Personnage(){};
    public Personnage(String nom, int vie, int attaque, int defense){};

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
    public int attaquer(Personnage cible){
        return cible.vie - (this.attaque - cible.defense);
    }
}
