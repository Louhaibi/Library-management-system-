/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author PC
 */
public class Penalite {
    
    int idPenalite;	
    int amende;
    int idUser;
    int idRes	;
    boolean isRegler	;
    String cin;

    public Penalite(int idPenalite, int amende, int idUser, int idRes, boolean isRegler) {
        this.idPenalite = idPenalite;
        this.amende = amende;
        this.idUser = idUser;
        this.idRes = idRes;
        this.isRegler = isRegler;
    }

    public Penalite(int idPenalite, int amende, int idUser, int idRes, boolean isRegler, String cin) {
        this.idPenalite = idPenalite;
        this.amende = amende;
        this.idUser = idUser;
        this.idRes = idRes;
        this.isRegler = isRegler;
        this.cin = cin;
    }
    

   
    
    
    
   
    public int getIdPenalite() {
        return idPenalite;
    }

    public void setIdPenalite(int idPenalite) {
        this.idPenalite = idPenalite;
    }

    public int getAmende() {
        return amende;
    }

    public void setAmende(int amende) {
        this.amende = amende;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public int getIdRes() {
        return idRes;
    }

    public void setIdRes(int idRes) {
        this.idRes = idRes;
    }
     public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public boolean isIsRegler() {
        return isRegler;
    }

    public void setIsRegler(boolean isRegler) {
        this.isRegler = isRegler;
    }

    
    
    
}
