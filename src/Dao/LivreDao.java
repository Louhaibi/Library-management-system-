/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Models.livreModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author MHD
 */
public class LivreDao  {
    
   DButil dbutil = new DButil();
  public boolean insertLivreRegulier (livreModel obj) throws SQLException{

    String sql = "insert into doc (titre,nom_autheur,nbCopie,datePublication,champ1 ,idCat,type) values ('" + obj.getTitre() + "' ,'"
                  + obj.getNomAuteur() +"', "+ obj.getNbCopie() +", '"+obj.getDatePublication()+"', '"+obj.getIsbn()+"' ,"+obj.getIdCat()+" , 'livreRegulier' ) ";
    if(dbutil.DML(sql)){
          return true;
    }
    return false;
}

 public boolean insertLivreDemander (livreModel obj) throws SQLException{

    String sql = "insert into doc (titre,nom_auteur,nbCopie,datePublication,champ1 ,idCat,type) values ('" + obj.getTitre() + "' ,'"
                  + obj.getNomAuteur() +"', "+ obj.getNbCopie() +", '"+obj.getDatePublication()+"', '"+obj.getIsbn()+"' ,"+obj.getIdCat()+" , 'livreDemander' ) ";
    if(dbutil.DML(sql)){
          return true;
    }
    return false;
}

  public boolean update (livreModel obj) throws SQLException{
      
    String sql = "update Doc set titre = '"+ obj.getTitre() +"', nom_autheur = '"+ obj.getNomAuteur() +"' , nbCopie = "+ obj.getNbCopie() +" ,datePublication = '"+obj.getDatePublication()+"' , champ1 = '"+obj.getIsbn()+"' , idCat = "+obj.getIdCat()+" where idDoc = "+obj.getIdLivre()+" "; 
    if(dbutil.DML(sql)){
          return true;
    }
    return false; 
}

  public boolean delete (livreModel obj) throws SQLException{

   String sql = "delete from doc where idDoc = "+obj.getIdLivre()+" "; 
    if(dbutil.DML(sql)){
          return true;
    }
    return false; 


}

  public livreModel select(livreModel obj) throws SQLException{

   String sql = "select * from Doc where idDoc = "+obj.getIdLivre()+"  "; 
   ResultSet rs = dbutil.select(sql);
   if(rs.next()){
       return new livreModel(rs.getInt(0), rs.getString(1), rs.getString(2), rs.getInt(3), rs.getString(4),rs.getString(6),rs.getInt(7))  ;  
}
   return null;
}

    public ArrayList<livreModel> getAllLivreRegulier() throws SQLException{
       ArrayList<livreModel> list = new ArrayList();
       String sql = "select * from doc where type ='livreRegulier'";
       ResultSet rs = dbutil.select(sql);
       while(rs.next()){
          list.add(new livreModel(rs.getInt(0), rs.getString(1), rs.getString(2), rs.getInt(3), rs.getString(4),rs.getString(6),rs.getInt(7)));
        }
       return list;
}

public ArrayList<livreModel> getAllLivreDemander() throws SQLException{
       ArrayList<livreModel> list = new ArrayList();
       String sql = "select * from doc where type ='livreDemander'";
       ResultSet rs = dbutil.select(sql);
       while(rs.next()){
          list.add(new livreModel(rs.getInt(0), rs.getString(1), rs.getString(2), rs.getInt(3), rs.getString(4),rs.getString(6),rs.getInt(7)));
        }
       return list;
}

    public ResultSet getRsAllLivreRegulier() throws SQLException{

       String sql = "select idDoc,titre,nom_autheur,nbCopie,datePublication,champ1 ,nomCat  from doc , categorie  where doc.idCat = categorie.idCat and  type = 'livreRegulier'";
       ResultSet rs = dbutil.select(sql);
       return rs;
}

public ResultSet getRsAllLivreDemander() throws SQLException{

       String sql = "select idDoc,titre,nom_autheur,nbCopie,datePublication,champ1 as 'ISBN' ,nomCat  from doc , categorie  where doc.idCat = categorie.idCat and  type = 'livreDemander'";
       ResultSet rs = dbutil.select(sql);
       return rs;
}


    public ResultSet searchLivreRegulier(String colName , String key ) throws SQLException{

       String sql = "select idDoc,titre,nom_autheur,nbCopie,datePublication,champ1 ,nomCat from doc , categorie where  doc.idCat = categorie.idCat and type = 'livreRegulier' and  "+colName+" like '"+key+"%'  "; 
       ResultSet rs = dbutil.select(sql);
       return rs;

    }

    public ResultSet searchLivreDemander(String colName , String key ) throws SQLException{

       String sql = "select idDoc,titre,nom_autheur,nbCopie,datePublication,champ1 ,nomCat from doc , categorie where  doc.idCat = categorie.idCat and type = 'livreDemander' and "+colName+" like '"+key+"%'  "; 
       ResultSet rs = dbutil.select(sql);
       return rs;

    }











    









    
    

    
   

}
