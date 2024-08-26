/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author MHD
 */
public class ReservationModel {
    
   private int idRes;
   private String dateDebutRes;
   private String dateFinRes;
   private int isReturned; 
   private float prixApaye;
   private int idUser;
   private int idExemplaire;
   private String typeRes;

    public ReservationModel(int idRes, String dateDebutRes, String dateFinRes, int isReturned, float prixApaye, int idUser, int idExemplaire, String typeRes) {
        this.idRes = idRes;
        this.dateDebutRes = dateDebutRes;
        this.dateFinRes = dateFinRes;
        this.isReturned = isReturned;
        this.prixApaye = prixApaye;
        this.idUser = idUser;
        this.idExemplaire = idExemplaire;
        this.typeRes = typeRes;
    }

    public ReservationModel() {
    }

    public int getIdRes() {
        return idRes;
    }

    public String getDateDebutRes() {
        return dateDebutRes;
    }

    public String getDateFinRes() {
        return dateFinRes;
    }

    public int getIsReturned() {
        return isReturned;
    }

    public float getPrixApaye() {
        return prixApaye;
    }

    public int getIdUser() {
        return idUser;
    }

    public int getIdExemplaire() {
        return idExemplaire;
    }

    public String getTypeRes() {
        return typeRes;
    }

    public void setIdRes(int idRes) {
        this.idRes = idRes;
    }

    public void setDateDebutRes(String dateDebutRes) {
        this.dateDebutRes = dateDebutRes;
    }

    public void setDateFinRes(String dateFinRes) {
        this.dateFinRes = dateFinRes;
    }

    public void setIsReturned(int isReturned) {
        this.isReturned = isReturned;
    }

    public void setPrixApaye(float prixApaye) {
        this.prixApaye = prixApaye;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public void setIdExemplaire(int idExemplaire) {
        this.idExemplaire = idExemplaire;
    }

    public void setTypeRes(String typeRes) {
        this.typeRes = typeRes;
    }

 
   

}
