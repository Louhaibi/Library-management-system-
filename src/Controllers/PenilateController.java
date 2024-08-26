/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Dao.PenaliteDAO;

/**
 *
 * @author PC
 */
public class PenilateController {
    PenaliteDAO pdao= new PenaliteDAO(); 

    public PenaliteDAO getPdao() {
        return pdao;
    }

    public void setPdao(PenaliteDAO pdao) {
        this.pdao = pdao;
    }
    
    
    
}
