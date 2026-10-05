package sio.model;

import java.util.ArrayList;

public class Categorie {
    private int id;
    private String nom;
    private ArrayList<Intervenant> intervenants;

    public Categorie() {
    }

    public Categorie(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public ArrayList<Intervenant> getIntervenants() {
        return intervenants;
    }

    public void setIntervenants(ArrayList<Intervenant> intervenants) {
        this.intervenants = intervenants;
    }
}
