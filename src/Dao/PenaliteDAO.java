/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Models.Penalite;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author PC
 */
public class PenaliteDAO {
    
         DButil dbutil = new DButil();
         
          public boolean insertPenalite(Penalite p) throws SQLException{
              
    int isRegler = p.isIsRegler()? 1 : 0;
    String sql = "INSERT INTO `penalite`(`amende`, `idUser`, `idRes`, `isRegler`) VALUES ("+p.getAmende()+","+p.getIdUser()+","+p.getIdRes()+","+isRegler+") ";
    if(dbutil.DML(sql)){
          return true;
    }
    return false;
}

        public ArrayList<Penalite>  getAllListPenalite() {
       ArrayList<Penalite> list = new ArrayList();
       String sql = "SELECT idPenalite ,amende ,p.idUser ,idRes ,isRegler , cin FROM `penalite` p, `users` u WHERE p.idUser = u.idUser;";
       ResultSet rs;
             try {
                 rs = dbutil.select(sql);
                  while(rs.next()){
           

          list.add(new Penalite(rs.getInt("idPenalite"), rs.getInt("amende"),rs.getInt("idUser"), rs.getInt("idRes"), rs.getInt("isRegler")==1,rs.getString("cin") ));
        }
             } catch (SQLException ex) {
                 Logger.getLogger(PenaliteDAO.class.getName()).log(Level.SEVERE, null, ex);
             }
      
      
       return list;
} 
        
        
     public  boolean regler(int id){
     
             
    String sql = "UPDATE `penalite` SET`isRegler`= 1 WHERE  `idPenalite`="+id;
             try {
                 if(dbutil.DML(sql)){
                     return true;
                 }        } catch (SQLException ex) {
                 Logger.getLogger(PenaliteDAO.class.getName()).log(Level.SEVERE, null, ex);
             }
    return false;
     
     }
  
     
      public  boolean delete(int id){
     
             
    String sql = "DELETE FROM `penalite` WHERE  `idPenalite`="+id;
             try {
                 if(dbutil.DML(sql)){
                     return true;
                 }        } catch (SQLException ex) {
                 Logger.getLogger(PenaliteDAO.class.getName()).log(Level.SEVERE, null, ex);
             }
    return false;
     
     }
  
    
}
