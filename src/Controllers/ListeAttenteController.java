/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Dao.ListeAttenteDAO;

/**
 *
 * @author PC
 */
public class ListeAttenteController {
    ListeAttenteDAO ladao = new ListeAttenteDAO();

    public ListeAttenteDAO getLadao() {
        return ladao;
    }

    public void setLadao(ListeAttenteDAO ladao) {
        this.ladao = ladao;
    }
    
    
}
