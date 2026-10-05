package sio.model;

public class Prestataire extends Intervenant{
    private boolean forfait;
    private double coutJournalier;
    private Societe societe;

    public Prestataire(int id, String prenom, String nom, boolean forfait, double coutJournalier, Societe societe) {
        super(id, prenom, nom);
        this.forfait = forfait;
        this.coutJournalier = coutJournalier;
        this.societe = societe;
    }

    public boolean isForfait() {
        return forfait;
    }

    public void setForfait(boolean forfait) {
        this.forfait = forfait;
    }

    public double getCoutJournalier() {
        return coutJournalier;
    }

    public void setCoutJournalier(double coutJournalier) {
        this.coutJournalier = coutJournalier;
    }

    public Societe getSociete() {
        return societe;
    }

    public void setSociete(Societe societe) {
        this.societe = societe;
    }

}
