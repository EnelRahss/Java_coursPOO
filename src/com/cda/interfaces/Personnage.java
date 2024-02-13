package com.cda.interfaces;

public class Personnage {
    /*--------------
        Attributs
     ---------------*/
    private String nom;
    private  int attaque;
    private  int defense;
    private int vie;
        /*--------------
        Constructeurs
     ---------------*/
    public Personnage(){}
    public Personnage(String nom, int attaque, int defense, int vie){
        this.nom = nom;
        this.attaque = attaque;
        this.defense = defense;
        this.vie = vie;
    }
    /*--------------
        Getter et Setter
     ---------------*/
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
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

    public int getVie() {
        return vie;
    }

    public void setVie(int vie) {
        this.vie = vie;
    }
    //METHODE
    public void attaquer(Personnage cible){}
}
