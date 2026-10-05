package test;

import sio.model.Prestataire;
import sio.model.Salarie;
import sio.model.Societe;

import java.time.LocalDate;
import java.util.ArrayList;

public class TestIntervenant {
    public static void main(String[] args) {
        Societe societe = new Societe(1, "InfoServices", "12 rue de la Paix", "75002", "Paris", 600, new ArrayList<Prestataire>());

        Prestataire prestataire = new Prestataire(1, "Paul", "Martin", true, 450, societe);
        societe.addPrestataire(prestataire);

        Salarie salarie = new Salarie(2, "Julie", "Durand", LocalDate.of(2020, 9, 1), 3);

        System.out.println("Nom : " + prestataire.getNom());
        System.out.println("Prénom : " + prestataire.getPrenom());
        System.out.println("Forfait : " + prestataire.isForfait());
        System.out.println("Coût journalier : " + prestataire.getCoutJournalier());
        System.out.println("Raison sociale : " + prestataire.getSociete().getRaisonSocial());

        System.out.println("Nom : " + salarie.getNom());
        System.out.println("Prénom : " + salarie.getPrenom());
        System.out.println("Date d'embauche : " + salarie.getDtEmbauche());
        System.out.println("Échelon : " + salarie.getEchelon());
        salarie.information("En arrêt maladie");
    }
}
