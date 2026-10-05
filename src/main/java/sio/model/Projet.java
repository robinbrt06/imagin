package sio.model;

import java.util.ArrayList;

public class Projet {
    private int id;
    private String nom;
    private int nbJoursPrevus;
    private int budgetPrevu;
    private Intervenant responsable;
    private ArrayList<Affectation> affectations;

    public Projet() {
    }

    public Projet(int id, String nom, int nbJoursPrevus, int budgetPrevu) {
        this.id = id;
        this.nom = nom;
        this.nbJoursPrevus = nbJoursPrevus;
        this.budgetPrevu = budgetPrevu;
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

    public int getNbJoursPrevus() {
        return nbJoursPrevus;
    }

    public void setNbJoursPrevus(int nbJoursPrevus) {
        this.nbJoursPrevus = nbJoursPrevus;
    }

    public int getBudgetPrevu() {
        return budgetPrevu;
    }

    public void setBudgetPrevu(int budgetPrevu) {
        this.budgetPrevu = budgetPrevu;
    }

    public Intervenant getResponsable() {
        return responsable;
    }

    public void setResponsable(Intervenant responsable) {
        this.responsable = responsable;
    }

    public ArrayList<Affectation> getAffectations() {
        return affectations;
    }

    public void setAffectations(ArrayList<Affectation> affectations) {
        this.affectations = affectations;
    }
}
