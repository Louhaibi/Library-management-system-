/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Asus
 */
public class ExemplaireModel {
    private String codeBar;
    private int idExemplaire;
    private double prix;
    private String dateAchat;
    private int idDoc;

    public ExemplaireModel(){
        
    }
    
    public ExemplaireModel(String codeBar, int idExemplaire, double prix, String dateAchat, int idDoc) {
        this.codeBar = codeBar;
        this.idExemplaire = idExemplaire;
        this.prix = prix;
        this.dateAchat = dateAchat;
        this.idDoc = idDoc;
    }

    public String getCodeBar() {
        return codeBar;
    }

    public void setCodeBar(String codeBar) {
        this.codeBar = codeBar;
    }

    public int getIdExemplaire() {
        return idExemplaire;
    }

    public void setIdExemplaire(int idExemplaire) {
        this.idExemplaire = idExemplaire;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public String getDateAchat() {
        return dateAchat;
    }

    public void setDateAchat(String dateAchat) {
        this.dateAchat = dateAchat;
    }

    public int getIdDoc() {
        return idDoc;
    }

    public void setIdDoc(int idDoc) {
        this.idDoc = idDoc;
    }

    @Override
    public String toString() {
        return "ExemplaireModel{" + "codeBar=" + codeBar + ", idExemplaire=" + idExemplaire + ", prix=" + prix + ", dateAchat=" + dateAchat + ", idDoc=" + idDoc + '}';
    }
    
    
    
    
}
