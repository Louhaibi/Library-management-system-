/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author MHD
 */
public class DButil {
    public boolean DML(String sql) throws SQLException{
        
         Connection con = DBconnect.getConnection();
         Statement st = con.createStatement();  
         st.executeUpdate(sql);
         return true;
}

   public ResultSet select(String sql) throws SQLException{
        Connection con = DBconnect.getConnection();
        Statement st = con.createStatement();  
        ResultSet rs = st.executeQuery(sql);
        return rs; 
 
}

}
