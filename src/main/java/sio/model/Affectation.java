package sio.model;

public class Affectation {
    private int annee;
    private int semaine;
    private int tempsPasse;
    private Intervenant intervenant;
    private Projet projet;

    public Affectation() {
    }

    public Affectation(int annee, int semaine, int tempsPasse) {
        this.annee = annee;
        this.semaine = semaine;
        this.tempsPasse = tempsPasse;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public int getSemaine() {
        return semaine;
    }

    public void setSemaine(int semaine) {
        this.semaine = semaine;
    }

    public int getTempsPasse() {
        return tempsPasse;
    }

    public void setTempsPasse(int tempsPasse) {
        this.tempsPasse = tempsPasse;
    }

    public Intervenant getIntervenant() {
        return intervenant;
    }

    public void setIntervenant(Intervenant intervenant) {
        this.intervenant = intervenant;
    }

    public Projet getProjet() {
        return projet;
    }

    public void setProjet(Projet projet) {
        this.projet = projet;
    }
}
