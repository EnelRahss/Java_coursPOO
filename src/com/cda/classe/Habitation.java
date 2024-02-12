package com.cda.classe;

public class Habitation {
    private String nom;
    private double longueur;
    private double largeur;
    private int nbEtage;

    //Constructeurs
    public Habitation(){}
    public Habitation(String nom, double longueur, double largeur, int nbEtage){
        this.nom = nom;
        this.longueur = longueur;
        this.largeur = largeur;
        this.nbEtage = nbEtage;
    }

    // Getter et Setter
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getLongueur() {
        return longueur;
    }

    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }

    public double getLargeur() {
        return largeur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    public double getnbEtage() {
        return nbEtage;
    }

    public void setnbEtage(int nbEtage) {
        this.nbEtage = nbEtage;
    }

    //Méthode pour calculer la surface d'habitation
    public double surface(){
        return this.largeur * this.longueur * this.nbEtage;
    }

}
