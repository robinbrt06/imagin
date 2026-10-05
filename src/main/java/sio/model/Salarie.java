package sio.model;

import java.time.LocalDate;

public class Salarie extends Intervenant {
    private LocalDate dtEmbauche;
    private int echelon;
    private static final double COUT_JOURNALIER = 550;


    public Salarie(int id, String prenom, String nom, LocalDate dtEmbauche, int echelon) {
        super(id, prenom, nom);
        this.dtEmbauche = dtEmbauche;
        this.echelon = echelon;
    }

    public LocalDate getDtEmbauche() {
        return dtEmbauche;
    }

    public void setDtEmbauche(LocalDate dtEmbauche) {
        this.dtEmbauche = dtEmbauche;
    }

    public int getEchelon() {
        return echelon;
    }

    public void setEchelon(int echelon) {
        this.echelon = echelon;
    }

    @Override
    public double calculCoutProjet(int nbJour) {
        return nbJour * COUT_JOURNALIER;
    }

}
