package com.cda.classe;

public class Vehicule {
    private String nom;
    private int nbRoue;
    private int vitesse;

        //Constructeur
    public Vehicule(){};
    public Vehicule(String nom, int nbRoue, int vitesse){
        this.nom = nom;
        this.nbRoue = nbRoue;
        this.vitesse = vitesse;
    };

        // Getter et Setter
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbRoue() {
        return nbRoue;
    }

    public void setNbRoue(int nbRoue) {
        this.nbRoue = nbRoue;
    }

    public int getVitesse() {
        return vitesse;
    }

    public void setVitesse(int vitesse) {
        this.vitesse = vitesse;
    }

    //Méthodes
    public void boost(){
        this.vitesse += 50;
    }

    public String detect(){
        if (nbRoue == 4){
            return "voiture";
        } else if (nbRoue == 2) {
            return "moto";
        } else {
            return "autre";
        }
    }

    public String plusRapide(Vehicule comparaison){
        if (this.vitesse > comparaison.vitesse){
            return this.nom + " et sa vitesse " + this.vitesse;
        } else if (this.vitesse < comparaison.vitesse) {
            return comparaison.nom + " et sa vitesse " + comparaison.vitesse;
        }else {
            return "error";
        }
    }


}
