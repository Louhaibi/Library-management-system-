/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author MHD
 */
public class PeriodicModel extends Doc {
    
     private int idPeriodic;
     private String issn;

    public PeriodicModel(int idPeriodic, String titre, String nomAuteur, int nbCopie, String datePublication,String issn ,int idCat) {
        super(titre, nomAuteur, nbCopie, datePublication, idCat);
        this.idPeriodic = idPeriodic;
        this.issn = issn;
    }

    public PeriodicModel() {
        super();
    }

    public int getIdPeriodic() {
        return idPeriodic;
    }

    public String getIssn() {
        return issn;
    }

    public String getTitre() {
        return titre;
    }

    public String getNomAuteur() {
        return nomAuteur;
    }

    public int getNbCopie() {
        return nbCopie;
    }

    public String getDatePublication() {
        return datePublication;
    }

    public int getIdCat() {
        return idCat;
    }

    public void setIdPeriodic(int idPeriodic) {
        this.idPeriodic = idPeriodic;
    }

    public void setIssn(String issn) {
        this.issn = issn;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setNomAuteur(String nomAuteur) {
        this.nomAuteur = nomAuteur;
    }

    public void setNbCopie(int nbCopie) {
        this.nbCopie = nbCopie;
    }

    public void setDatePublication(String datePublication) {
        this.datePublication = datePublication;
    }

    public void setIdCat(int idCat) {
        this.idCat = idCat;
    }


    

}
