/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Models.CategorieModel;
import Models.ExemplaireModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Asus
 */
public class ExemplaireDao  implements Dao<ExemplaireModel>{
    DButil dbutil = new DButil();

    @Override
    public boolean insert(ExemplaireModel obj) throws SQLException {
        String sql = "insert into exemplaire (codeBar,idExemplaire,prix,dateAchat,idDoc) values ( '"+ obj.getCodeBar()+ "' , '"+ obj.getIdExemplaire()+"' , '"+obj.getPrix()+"' , '"+obj.getDateAchat()+"' , '"+obj.getIdDoc()+"'  ) ";                                      
        if(dbutil.DML(sql)){
          return true;
        }
        String sql1= " update Doc set  nbCopie = nbCopie+1 where idDoc = "+obj.getIdDoc()+" "; 
            if(dbutil.DML(sql1)){
            return true;
        }     
         return false;  
    }

    @Override
    public boolean update(ExemplaireModel obj) throws SQLException {
        String sql = "update exemplaire set codeBar = '"+ obj.getCodeBar()+" ', prix = '"+obj.getPrix()+" ', dateAchat = '"+obj.getDateAchat()+"' where idExemplaire = "+obj.getIdExemplaire()+" "; 
        if(dbutil.DML(sql)){
          return true;
        }
        return false;     
    }

    @Override
    public boolean delete(ExemplaireModel obj) throws SQLException {
        String sql = "delete from exemplaire where idExemplaire = "+obj.getIdExemplaire()+" "; 
        if(dbutil.DML(sql)){
              return true;
        }
        String sql1= " update Doc set  nbCopie = nbCopie-1 where idDoc = "+obj.getIdDoc()+" "; 
        if(dbutil.DML(sql1)){
            return true;
        }       
        return false;
    }

    @Override
    public ExemplaireModel select(ExemplaireModel obj) throws SQLException {
        String sql = "select * from exemplaire where idExemplaire = "+obj.getIdExemplaire()+" "; 
        ResultSet rs = dbutil.select(sql);
        if(rs.next()){
            return new ExemplaireModel(rs.getString(0), rs.getInt(1), rs.getDouble(2), rs.getString(3), rs.getInt(4))  ;  
        }
        return null;  
    }

    @Override
    public ArrayList<ExemplaireModel> getAll() throws SQLException {
        ArrayList<ExemplaireModel> list = new ArrayList();
        String sql = "select * from exemplaire ";
        ResultSet rs = dbutil.select(sql);
        while(rs.next()){
            list.add(new ExemplaireModel(rs.getString(0), rs.getInt(1), rs.getDouble(2), rs.getString(3), rs.getInt(4)));
        }
        return list;
    }

    @Override
    public ResultSet getRsAll() throws SQLException {
        String sql = "select * from exemplaire ";
        ResultSet rs = dbutil.select(sql);
        return rs;    }

    @Override
    public ResultSet search(String colName, String key) throws SQLException {
        String sql = "select * from exemplaire where   "+colName+" like '"+key+"%'  "; 
        ResultSet rs = dbutil.select(sql);
        return rs;
    }
    
}
