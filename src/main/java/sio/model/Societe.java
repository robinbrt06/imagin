package sio.model;

import java.util.ArrayList;

public class Societe {
    private int id;
    private String raisonSocial;
    private String adresse;
    private String copos;
    private String ville;
    private double coutJournalier;
    private ArrayList<Prestataire> prestataires;

    public Societe() {
    }

    public Societe(int id, String raisonSocial, String adresse, String copos, String ville, double coutJournalier, ArrayList<Prestataire> prestataires) {
        this.id = id;
        this.raisonSocial = raisonSocial;
        this.adresse = adresse;
        this.copos = copos;
        this.ville = ville;
        this.coutJournalier = coutJournalier;
        this.prestataires = prestataires;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRaisonSocial() {
        return raisonSocial;
    }

    public void setRaisonSocial(String raisonSocial) {
        this.raisonSocial = raisonSocial;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getCopos() {
        return copos;
    }

    public void setCopos(String copos) {
        this.copos = copos;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public double getCoutJournalier() {
        return coutJournalier;
    }

    public void setCoutJournalier(double coutJournalier) {
        this.coutJournalier = coutJournalier;
    }

    public ArrayList<Prestataire> getPrestataires() {
        return prestataires;
    }

    public void setPrestataires(ArrayList<Prestataire> prestataires) {
        this.prestataires = prestataires;
    }

    public void addPrestataire(Prestataire p) {
        if (prestataires == null) {
            prestataires = new ArrayList<Prestataire>();
        }
        prestataires.add(p);
    }

}
