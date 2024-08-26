/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Models.livreModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class StastiquesDAO {
     DButil dbutil = new DButil();
   
    
    public ArrayList<String >  listEnpruntTop5() throws SQLException {
       ArrayList<String> list = new ArrayList();
       String sql = "SELECT d.type , d.titre  , count(r.idRes) nbrRes  FROM `doc` d , `exemplaire` e, `reservation` r  WHERE e.idDoc = d.idDoc AND r.idExemplaire = e.idExemplaire AND r.typeRes = 'emprunt' GROUP BY  d.idDoc ORDER BY nbrRes DESC LIMIT 10; ";
       ResultSet rs = dbutil.select(sql);
       while(rs.next()){
          list.add(rs.getString("type"));
          list.add(rs.getString("titre"));
          list.add(rs.getString("nbrRes"));
        }
       return list;
}
    
    public ArrayList<String >  listLocationtTop5() throws SQLException {
       ArrayList<String> list = new ArrayList();
       String sql = "SELECT d.type , d.titre  , count(r.idRes) nbrRes  FROM `doc` d , `exemplaire` e, `reservation` r  WHERE e.idDoc = d.idDoc AND r.idExemplaire = e.idExemplaire AND r.typeRes = 'location' GROUP BY  d.idDoc ORDER BY nbrRes DESC LIMIT 10; ";
       ResultSet rs = dbutil.select(sql);
       while(rs.next()){
          list.add(rs.getString("type"));
          list.add(rs.getString("titre"));
          list.add(rs.getString("nbrRes"));
        }
       return list;
}
    
    public ArrayList<String >  listEmpruntbytype() throws SQLException {
       ArrayList<String> list = new ArrayList();
       String sql = "SELECT type ,titre, nbrRes from (SELECT d.type , d.titre , count(r.idRes) nbrRes FROM `doc` d , `exemplaire` e, `reservation` r WHERE e.idDoc = d.idDoc AND r.idExemplaire = e.idExemplaire AND r.typeRes = 'emprunt' GROUP BY d.idDoc ORDER BY nbrRes ) as result WHERE nbrRes = (SELECT count(rr.idRes) nbrRes FROM `doc` dd , `exemplaire` ee, `reservation` rr WHERE ee.idDoc = dd.idDoc AND rr.idExemplaire = ee.idExemplaire AND rr.typeRes = 'emprunt' AND dd.type= result.type GROUP BY dd.idDoc ORDER BY nbrRes DESC LIMIT 1 );";
       ResultSet rs = dbutil.select(sql);
       while(rs.next()){
          list.add(rs.getString("type"));
          list.add(rs.getString("titre"));
          list.add(rs.getString("nbrRes"));
        }
       return list;
}

     public ArrayList<String >  listLocationbytype() throws SQLException {
       ArrayList<String> list = new ArrayList();
       String sql = "SELECT type ,titre, nbrRes from (SELECT d.type , d.titre , count(r.idRes) nbrRes FROM `doc` d , `exemplaire` e, `reservation` r WHERE e.idDoc = d.idDoc AND r.idExemplaire = e.idExemplaire AND r.typeRes = 'location' GROUP BY d.idDoc ORDER BY nbrRes ) as result WHERE nbrRes = (SELECT count(rr.idRes) nbrRes FROM `doc` dd , `exemplaire` ee, `reservation` rr WHERE ee.idDoc = dd.idDoc AND rr.idExemplaire = ee.idExemplaire AND rr.typeRes = 'emprunt' AND dd.type= result.type GROUP BY dd.idDoc ORDER BY nbrRes DESC LIMIT 1 ); ";
       ResultSet rs = dbutil.select(sql);
       while(rs.next()){
          list.add(rs.getString("type"));
          list.add(rs.getString("titre"));
          list.add(rs.getString("nbrRes"));
        }
       return list;
}
     
     
    public  int nbrLocation() throws SQLException{
        String sql = "SELECT count(*) nbr FROM `reservation` WHERE `typeRes` = 'location';";
        ResultSet rs = dbutil.select(sql);
        
        if(rs.next()){
        return rs.getInt("nbr");
        }
    
         return 0;
    
    }
    
    public  int nbrEmprunt() throws SQLException{
        String sql = "SELECT count(*) nbr FROM `reservation` WHERE `typeRes` = 'emprunt';";
        ResultSet rs = dbutil.select(sql);
        
        if(rs.next()){
        return rs.getInt("nbr");
        }
    
         return 0;
    
    }
    
     public  int nbrClient() throws SQLException{
        String sql = "SELECT count(*) nbr FROM `users`";
        ResultSet rs = dbutil.select(sql);
        
        if(rs.next()){
        return rs.getInt("nbr");
        }
    
         return 0;
    
    }
     
    public  int nbrDoc(String s) throws SQLException{
        String sql = "SELECT count(*) nbr FROM `doc` where type = '"+s+"';" ;
        ResultSet rs = dbutil.select(sql);
        
        if(rs.next()){
        return rs.getInt("nbr");
        }
    
         return 0;
    
    }
    
     public  int nbrPen() throws SQLException{
        String sql = "SELECT count(*) nbr FROM `penalite`" ;
        ResultSet rs = dbutil.select(sql);
        
        if(rs.next()){
        return rs.getInt("nbr");
        }
    
         return 0;
    
    }
    
    
    public  int nbrPenR(int i) throws SQLException{
        String sql = "SELECT count(*) nbr FROM `penalite` where `isRegler`= "+i+" " ;
        ResultSet rs = dbutil.select(sql);
        
        if(rs.next()){
        return rs.getInt("nbr");
        }
    
         return 0;
    
    }
    
     public  int valPen() throws SQLException{
        String sql = "SELECT sum(amende) nbr FROM `penalite` " ;
        ResultSet rs = dbutil.select(sql);
        
        if(rs.next()){
        return rs.getInt("nbr");
        }
    
         return 0;
    
    }
     
     
        public  int valPenR(int i) throws SQLException{
        String sql = "SELECT sum(amende) nbr FROM `penalite` where `isRegler`= "+i+" " ;
        ResultSet rs = dbutil.select(sql);
        
        if(rs.next()){
        return rs.getInt("nbr");
        }
    
         return 0;
    
    }
    
    
   
    
     
     
    
}


