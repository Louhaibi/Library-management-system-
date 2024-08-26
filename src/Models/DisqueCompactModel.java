/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author MHD
 */
public class DisqueCompactModel extends Doc {
    
   int idDisqueCompact;
   String duree;

    public DisqueCompactModel(int idDisqueCompact,  String titre, String nomAuteur, int nbCopie, String datePublication,String duree, int idCat) {
        super(titre, nomAuteur, nbCopie, datePublication, idCat);
        this.idDisqueCompact = idDisqueCompact;
        this.duree = duree;
    }

    public DisqueCompactModel(){
        super();
   }

    public int getIdDisqueCompact() {
        return idDisqueCompact;
    }

    public String getDuree() {
        return duree;
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

    public void setIdDisqueCompact(int idDisqueCompact) {
        this.idDisqueCompact = idDisqueCompact;
    }

    public void setDuree(String duree) {
        this.duree = duree;
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
