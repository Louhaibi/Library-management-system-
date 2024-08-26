/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author PC
 */
public class ListeAttente {
    int 	idLA ,	idDoc;
    String cin;

    public ListeAttente(int idLA, int idDoc, String cin) {
        this.idLA = idLA;
        this.idDoc = idDoc;
        this.cin = cin;
    }

    public ListeAttente(int idDoc, String cin) {
        this.idDoc = idDoc;
        this.cin = cin;
    }
    
    

    public int getIdLA() {
        return idLA;
    }

    public void setIdLA(int idLA) {
        this.idLA = idLA;
    }

    public int getIdDoc() {
        return idDoc;
    }

    public void setIdDoc(int idDoc) {
        this.idDoc = idDoc;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    
}
