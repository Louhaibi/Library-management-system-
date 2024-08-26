/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author PC
 */
public class Users {
    
    int idUser;
    String prenom , nom ,cin ,numTel ,email ;
    byte[] image;
    Boolean isResid;
    String type;
    String login , mpd;

    public Users(int idUser, String prenom, String nom, String numTel, byte[] image, Boolean isResid) {
        this.idUser = idUser;
        this.prenom = prenom;
        this.nom = nom;
        this.numTel = numTel;
        this.image = image;
        this.isResid = isResid;
    }
    
    public Users(int idUser, String prenom, String nom, String numTel, byte[] image, Boolean isResid ,String type) {
        this.idUser = idUser;
        this.prenom = prenom;
        this.nom = nom;
        this.numTel = numTel;
        this.image = image;
        this.isResid = isResid;
        this.type =type;
    }
    
    
    public Users(int idUser, String prenom, String nom, String numTel,  Boolean isResid) {
        this.idUser = idUser;
        this.prenom = prenom;
        this.nom = nom;
        this.numTel = numTel;
        this.image = image;
        this.isResid = isResid;
    }

    public Users( String prenom, String nom, String numTel, Boolean isResid) {
        this.prenom = prenom;
        this.nom = nom;
        this.numTel = numTel;
        this.isResid = isResid;
        
        
    }

    public Users(int idUser, String prenom, String nom, String cin, String numTel, String email, byte[] image, Boolean isResid, String type, String login, String mpd) {
        this.idUser = idUser;
        this.prenom = prenom;
        this.nom = nom;
        this.cin = cin;
        this.numTel = numTel;
        this.email = email;
        this.image = image;
        this.isResid = isResid;
        this.type = type;
        this.login = login;
        this.mpd = mpd;
    }

    public Users(int idUser, String prenom, String nom, String cin, String numTel, String email, Boolean isResid, String type, String login, String mpd) {
        this.idUser = idUser;
        this.prenom = prenom;
        this.nom = nom;
        this.cin = cin;
        this.numTel = numTel;
        this.email = email;
        this.isResid = isResid;
        this.type = type;
        this.login = login;
        this.mpd = mpd;
    }

    public Users(String prenom, String nom, String cin, String numTel, String email, Boolean isResid, String type, String login, String mpd) {
        this.prenom = prenom;
        this.nom = nom;
        this.cin = cin;
        this.numTel = numTel;
        this.email = email;

        this.isResid = isResid;
        this.type = type;
        this.login = login;
        this.mpd = mpd;
    }
    
     public Users(String prenom, String nom, String cin, String numTel, String email, Boolean isResid) {
        this.prenom = prenom;
        this.nom = nom;
        this.cin = cin;
        this.numTel = numTel;
        this.email = email;

        this.isResid = isResid;
       
    }
    
    
    

    public Users() {
   
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNumTel() {
        return numTel;
    }

    public void setNumTel(String numTel) {
        this.numTel = numTel;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public Boolean getIsResid() {
        return isResid;
    }

    public void setIsResid(Boolean isResid) {
        this.isResid = isResid;
    }

   

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Users{" + "idUser=" + idUser + ", prenom=" + prenom + ", nom=" + nom + ", cin=" + cin + ", numTel=" + numTel + ", email=" + email + ", image=" + image + ", isResid=" + isResid + ", type=" + type + ", login=" + login + ", mpd=" + mpd + '}';
    }

   

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getMpd() {
        return mpd;
    }

    public void setMpd(String mpd) {
        this.mpd = mpd;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    
    
    
    
    
    
    
  
}
