/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Models.CategorieModel;
import Models.livreModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author MHD
 */
public class CategorieDao implements Dao<CategorieModel> {
      DButil dbutil = new DButil();



  public boolean insert (CategorieModel obj) throws SQLException{

    String sql = "insert into categorie (nomCat,division) values ( ' "+ obj.getNomCat() + "' , '"+ obj.getDivision() +"'  ) ";
    if(dbutil.DML(sql)){
          return true;
    }
    return false;
}

  public boolean update (CategorieModel obj) throws SQLException{
      
    String sql = "update categorie set nomCat = '"+ obj.getNomCat() +" ', division = '"+obj.getDivision() +"' where idCat = "+obj.getIdCat()+" "; 
    if(dbutil.DML(sql)){
          return true;
    }
    return false; 
}

  public boolean delete (CategorieModel obj) throws SQLException{

   String sql = "delete from categorie where idCat = "+obj.getIdCat()+" "; 
    if(dbutil.DML(sql)){
          return true;
    }
    return false; 


}

  public CategorieModel select(CategorieModel obj) throws SQLException{

   String sql = "select * from categorie where idCat = "+obj.getIdCat()+" "; 
   ResultSet rs = dbutil.select(sql);
   if(rs.next()){
       return new CategorieModel(rs.getInt(0), rs.getString(1), rs.getString(2))  ;  
}
   return null;
}

    public ArrayList<CategorieModel> getAll() throws SQLException{
       ArrayList<CategorieModel> list = new ArrayList();
       String sql = "select * from categorie ";
       ResultSet rs = dbutil.select(sql);
       while(rs.next()){
          list.add(new CategorieModel(rs.getInt(0), rs.getString(1), rs.getString(2)));
}
       return list;
}

    public ResultSet getRsAll() throws SQLException{

       String sql = "select * from categorie ";
       ResultSet rs = dbutil.select(sql);
       return rs;
}


    public ResultSet search(String colName , String key ) throws SQLException{

       String sql = "select * from categorie where   "+colName+" like '"+key+"%'  "; 
       ResultSet rs = dbutil.select(sql);
       return rs;

}

}
