/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Models.ListeAttente;
import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PC
 */
public class ListeAttenteDAO {
     DButil dbutil = new DButil();
     Connection con = null ;
	Statement stmt = null ;
	ResultSet res = null ;

    public ListeAttenteDAO() {
        
        con = (Connection) DBconnect.getConnection();
         try {
             stmt = (Statement) con.createStatement();
         } catch (SQLException ex) {
             Logger.getLogger(ListeAttenteDAO.class.getName()).log(Level.SEVERE, null, ex);
         }
    }
     
     
         
    public boolean insert(ListeAttente la) throws SQLException{
              
    String sql = "INSERT INTO `listeattente`(`cin`, `codeBare`) VALUES ('"+la.getCin()+"','"+la.getIdDoc()+"')";
    if(dbutil.DML(sql)){
          return true;
    }
    return false;
}

        public ArrayList<ListeAttente>  getListeAttente(int idDoc) {
       ArrayList<ListeAttente> list = new ArrayList<ListeAttente>();
       String sql = "SELECT `cin`, `idLA` FROM `listeattente` WHERE `codeBare` = "+idDoc;
       ResultSet rs;
             try {
                 rs = dbutil.select(sql);
                  while(rs.next()){
           

          list.add(new ListeAttente(rs.getInt("idLA"),idDoc,rs.getString("cin")));
        }
             } catch (SQLException ex) {
                 Logger.getLogger(ListeAttenteDAO.class.getName()).log(Level.SEVERE, null, ex);
             }
      
      
       return list;
} 
        
          
     
      public  boolean delete(int id){
     
             
    String sql = "DELETE FROM `listeattente` WHERE idLA ="+id;
             try {
                 if(dbutil.DML(sql)){
                     return true;
                 }        } catch (SQLException ex) {
                 Logger.getLogger(ListeAttenteDAO.class.getName()).log(Level.SEVERE, null, ex);
             }
    return false;
     
     
     }

//public String getClientEmail(){
//       
//       String sql = "SELECT `cin`, `idLA` FROM `listeattente` WHERE `codeBare` = "+idDoc;
//       ResultSet rs;
//             try {
//                 rs = dbutil.select(sql);
//                  while(rs.next()){
//           
//
//          list.add(new ListeAttente(rs.getInt("idLA"),idDoc,rs.getString("cin")));
//        }
//             } catch (SQLException ex) {
//                 Logger.getLogger(ListeAttenteDAO.class.getName()).log(Level.SEVERE, null, ex);
//             }
//      
//      
//       return list;
//
//         return null;
//
//}

  public  boolean deleteByCodeBare(int codebare ){
     
             
    String sql = "DELETE FROM listeattente WHERE idLA = (SELECT idLA from listeattente WHERE codeBare ="+codebare+" ORDER BY idLA LIMIT 1);";
             try {
                 if(dbutil.DML(sql)){
                     return true;
                 }        } catch (SQLException ex) {
                 Logger.getLogger(ListeAttenteDAO.class.getName()).log(Level.SEVERE, null, ex);
             }
    return false;
     
     
     }
      
      
  public boolean isExistByCin(String cin) {
        int count = -1;
        try
        {


        String req = "SELECT COUNT(*) COUNT FROM users WHERE cin = '"+cin+"'";
        res = stmt.executeQuery(req);

        res.next();
        count = res.getInt("COUNT");

        }catch(SQLException e)
        {
        System.out.println(e.getMessage());

        }

        if(count==0) return false;
        else if(count>0) return true;
        else return false;
              
   
    }
    
    
    
}
