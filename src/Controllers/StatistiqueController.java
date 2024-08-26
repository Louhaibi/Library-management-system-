/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Dao.StastiquesDAO;

/**
 *
 * @author PC
 */
public class StatistiqueController {
    
    StastiquesDAO sdao = new  StastiquesDAO();

    public StastiquesDAO getSdao() {
        return sdao;
    }

    public void setSdao(StastiquesDAO sdao) {
        this.sdao = sdao;
    }
    
    
    
    
}
