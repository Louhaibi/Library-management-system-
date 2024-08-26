/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.util.Date;

/**
 *
 * @author MHD
 */
public class livreModel {
    
       private int idLivre;
       private String titre;
       private String nomAuteur;
       private int nbCopie;
       private String datePublication;
       private String isbn; 
       private int idCat;

    public livreModel(int idLivre, String titre, String nomAuteur, int nbCopie, String datePublication, String isbn, int idCat) {
        this.idLivre = idLivre;
        this.titre = titre;
        this.nomAuteur = nomAuteur;
        this.nbCopie = nbCopie;
        this.datePublication = datePublication;
        this.isbn = isbn;
        this.idCat = idCat;
    }

    public livreModel() {
        // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getIdCat() {
        return idCat;
    }

    public void setIdCat(int idCat) {
        this.idCat = idCat;
    }


    public int getIdLivre() {
        return idLivre;
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

    public String getIsbn() {
        return isbn;
    }

    public void setIdLivre(int idLivre) {
        this.idLivre = idLivre;
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

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    

    

}
