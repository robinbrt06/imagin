package sio.model;

import java.util.ArrayList;

public class Intervenant {
    private int id;
    private String prenom;
    private String nom;
    private Categorie categorie;
    private ArrayList<Affectation> affectations;

    public Intervenant() {
    }

    public Intervenant(int id, String prenom, String nom) {
        this.id = id;
        this.prenom = prenom;
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    public ArrayList<Affectation> getAffectations() {
        return affectations;
    }

    public void setAffectations(ArrayList<Affectation> affectations) {
        this.affectations = affectations;
    }
}
