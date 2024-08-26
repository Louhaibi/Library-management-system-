/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author MHD
 */
public class CategorieModel {
    private int idCat;
    private String nomCat;
    private String division;

    public CategorieModel(int idCat, String nomCat , String division) {
        this.idCat = idCat;
        this.nomCat = nomCat;
        this.division = division;
    }

    public int getIdCat() {
        return idCat;
    }

    public String getNomCat() {
        return nomCat;
    }

    public void setIdCat(int idCat) {
        this.idCat = idCat;
    }

    public void setNomCat(String nomCat) {
        this.nomCat = nomCat;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

   public String toString(){
   
        return "[ " + this.getIdCat() + " " + this.division + ""+ this.getNomCat() +"  ]";
    
   }

    public CategorieModel() {
    }

}
