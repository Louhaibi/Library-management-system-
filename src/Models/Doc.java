/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author MHD
 */
public class Doc {
    
       protected String titre;
       protected String nomAuteur;
       protected int nbCopie;
       protected String datePublication; 
       protected int idCat;

    public Doc(String titre, String nomAuteur, int nbCopie, String datePublication, int idCat) {
        this.titre = titre;
        this.nomAuteur = nomAuteur;
        this.nbCopie = nbCopie;
        this.datePublication = datePublication;
        this.idCat = idCat;
    }

    

    public Doc() {
        // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getIdCat() {
        return idCat;
    }

    public void setIdCat(int idCat) {
        this.idCat = idCat;
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

   

}
