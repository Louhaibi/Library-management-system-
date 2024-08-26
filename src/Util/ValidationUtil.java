/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Util;

import Dao.DBconnect;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author MHD
 */
public class ValidationUtil {
   
    public boolean isUnique(String code , String table ,String field) throws SQLException{
          String sql = "select count("+field+") from "+table+"  where "+field+" = '"+ code +"' ";
           Connection con = DBconnect.getConnection();
           Statement st = con.createStatement();  
           ResultSet rs = st.executeQuery(sql);
           if(rs.next()){
                   if(rs.getInt(1) == 1  ){
                       return true;
                    }
           }
           return false;
   }     

    public boolean isExist(String code , String table , String field) throws SQLException{
          String sql = "select count("+field+") from "+table+"  where "+field+" = '"+ code +"' ";
           System.out.println(sql);
           Connection con = DBconnect.getConnection();
           Statement st = con.createStatement();  
           ResultSet rs = st.executeQuery(sql);  
           
           if(rs.next()){
                   if(rs.getInt(1) != 0  ){
                       
                       return true;
                    }
           }
           return false;
   } 









 
     public boolean isEmpty(String data){

     if(data.isEmpty()){
         return true;
     }
     return false;
    }

    public boolean length(String data,int n,int m){

        if(data.length() < n || data.length() > m){
               return false;
        }

        return true;
    }

    








}
