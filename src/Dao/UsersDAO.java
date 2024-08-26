/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import Models.Users;
/**
 *
 * @author PC
 */
public class UsersDAO {
    
        Connection con = null ;
	Statement stmt = null ;
	ResultSet res = null ;

    public UsersDAO() {
            try {
                con = (Connection) DBconnect.getConnection();
                stmt = (Statement) con.createStatement();
            } catch (SQLException ex) {
                Logger.getLogger(UsersDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
        
        

    
    public boolean isExist(String userN, String pass) {
        int count = -1;
        try
{


String req = "SELECT COUNT(*) COUNT FROM users WHERE login = '"+userN+"' and mdp = '"+pass+"';";
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
 
    
     public boolean isExistByLogin(String login) {
        int count = -1;
        try
        {


        String req = "SELECT COUNT(*) COUNT FROM users WHERE login = '"+login+"'";
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
 public ArrayList<Users> getUserstList()
    {
        ArrayList<Users> usersList = new ArrayList();
        String query = "SELECT * FROM USERS";
 
       
     
 
      
 
            
            try {
                res = stmt.executeQuery(query);
            } catch (SQLException ex) {
                System.out.println("Dao.UsersDAO.getUserstList() catch stmt.executeQuery(query); ");
                Logger.getLogger(UsersDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
            Users user;
 
            try {
                while(res.next())
                {
                    //(idUser, prenom,nom, cin,  numTel,email,isResid, type,login,mpd)
                    
                    user = new Users(
                            res.getInt("idUser"),
                            res.getString("prenom"),
                            res.getString("nom"),
                            res.getString("cin"),
                            res.getString("numTel"),
                            res.getString("email"),
                            res.getBytes("image"),
                            res.getInt("isResid")==1? true : false ,
                            res.getString("type"),
                            res.getString("login"),
                            res.getString("mdp")
                    );
                    usersList.add(user);
                }
                
//            con.close();
            } catch (SQLException ex) {
                Logger.getLogger(UsersDAO.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("Dao.UsersDAO.getUserstList() next ");
            }
       
 
        return usersList;
    }
  
 public Users getUserByLogin(String l){
     String query = "SELECT * FROM USERS where login = '"+l+"'";
            Users user = null;
            try {
                res = stmt.executeQuery(query);
                
            if(res.next()){
            user = new Users(
                    res.getInt("idUser"),
                    res.getString("prenom"),
                    res.getString("nom"),
                    res.getString("numTel"),
                    res.getBytes("image"),
                    Boolean.parseBoolean(res.getString("isResid")),
                    res.getString("type"));}
            } catch (SQLException ex) {
                System.out.println("Catch Dao.UsersDAO.getUserByLogin()");
                Logger.getLogger(UsersDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
            
             
            return user;
 
 }
 
     public int add(Users u , String selectedImagePath)
    {
                PreparedStatement ps;
                int r=0;
 try {
                if (selectedImagePath == null) {
                    
                        ps = (PreparedStatement) con.prepareStatement("INSERT INTO `USERS`(`prenom`, `nom`,`cin`, `numTel`, `email`, `isResid`) VALUES (?,?,?,?,?,?)");
                    
                }
                else {
                    ps = (PreparedStatement) con.prepareStatement("INSERT INTO `USERS`(`prenom`, `nom`,`cin`, `numTel`, `email`, `isResid`,`image`) VALUES (?,?,?,?,?,?,?)");
 
                    InputStream img = new FileInputStream(new File(selectedImagePath));
                    ps.setBlob(7, img);
                }
                ps.setString(1, u.getPrenom());
                ps.setString(2, u.getNom());
                ps.setString(3, u.getCin());
                ps.setString(4, u.getNumTel());
                ps.setString(5, u.getEmail());
                ps.setInt(6, u.getIsResid() ? 1 : 0);
                r= ps.executeUpdate();
//               con.close();

                    } catch (SQLException ex) {
                        Logger.getLogger(UsersDAO.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (FileNotFoundException ex) {
                Logger.getLogger(UsersDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
                return r;
           
        }
 
     public int addSAdmin(Users u , String selectedImagePath) 
    {
                PreparedStatement ps;
                int r = 0;
    try {
                if (selectedImagePath == null) {
                 
                    ps = (PreparedStatement) con.prepareStatement("INSERT INTO `USERS`(`prenom`, `nom`,`cin`, `numTel`, `email`, `type`, `isResid`,`login`, `mdp`) VALUES (?,?,?,?,?,?,?,?,?)");
                    
                }
 
                else {
                    ps = (PreparedStatement) con.prepareStatement("INSERT INTO `USERS`( `prenom`, `nom`,`cin`, `numTel`, `email`, `type`, `isResid`, `login`, `mdp` , `image`) VALUES (?,?,?,?,?,?,?,?,?,?)");
 
                    InputStream img = new FileInputStream(new File(selectedImagePath));
                    ps.setBlob(10, img);
                }
              
                ps.setString(1, u.getPrenom());
                ps.setString(2, u.getNom());
                ps.setString(3, u.getCin());
                ps.setString(4, u.getNumTel());
                ps.setString(5, u.getEmail());
                ps.setString(6, u.getType());
                ps.setInt(7, u.getIsResid() ? 1 : 0);
                ps.setString(8, u.getLogin());
                ps.setString(9, u.getMpd());
                 r= ps.executeUpdate();
//               con.close();
                     } catch (SQLException ex) {
                         System.out.println("catsh Dao.UsersDAO.addSAdmin()");
                        Logger.getLogger(UsersDAO.class.getName()).log(Level.SEVERE, null, ex);
                    }
                  catch (FileNotFoundException ex) {
                       System.out.println("catsh Dao.UsersDAO.addSAdmin()");
                        Logger.getLogger(UsersDAO.class.getName()).log(Level.SEVERE, null, ex);
                    }
                return r;
           
        }
     public int update(Users u , String selectedImagePath) throws SQLException, FileNotFoundException
    {
                PreparedStatement ps;
 
                if (selectedImagePath == null) {
                    ps = (PreparedStatement) con.prepareStatement("UPDATE `users` SET `prenom`=?,`nom`=?,`numTel`=?,`isResid`=? WHERE `idUser`= ?");
                     ps.setInt(5, u.getIdUser());
                }
 
                else {
                    ps = (PreparedStatement) con.prepareStatement("UPDATE `users` SET `prenom`=?,`nom`=?,`numTel`=?,`isResid`=?, `image`=? WHERE `idUser`= ?");
 
                    InputStream img = new FileInputStream(new File(selectedImagePath));
                    ps.setBlob(5, img);
                    ps.setInt(6, u.getIdUser());
                }
                
                
                ps.setString(1, u.getPrenom());
                ps.setString(2, u.getNom());

                ps.setString(3, u.getNumTel());
                
                ps.setInt(4, u.getIsResid() ? 1 : 0);
               
 
                int r= ps.executeUpdate();
//               con.close();
                return r;
           
        }
     
      public int updateAdmin(Users u , String selectedImagePath) throws SQLException, FileNotFoundException
    {
                PreparedStatement ps;
 
                if (selectedImagePath == null) {
                    ps = (PreparedStatement) con.prepareStatement("UPDATE `users` SET `prenom`=?,`nom`=?,`cin`=?,`numTel`=?,`email`=?,`type`=?,`isResid`=?,`login`=?,`mdp`=? WHERE `idUser`= ?");
                     ps.setInt(10, u.getIdUser());
                }
 
                else {
                    ps = (PreparedStatement) con.prepareStatement("UPDATE `users` SET `prenom`=?,`nom`=?,`cin`=?,`numTel`=?,`email`=?,`type`=?,`isResid`=?,`login`=?,`mdp`=? ,`image`=? WHERE `idUser`= ?");
 
                    InputStream img = new FileInputStream(new File(selectedImagePath));
                    ps.setBlob(10, img);
                    ps.setInt(11, u.getIdUser());
                }
                
                
                ps.setString(1, u.getPrenom());
                ps.setString(2, u.getNom());
                ps.setString(3, u.getCin());
                ps.setString(4, u.getNumTel());
                ps.setString(5, u.getEmail());
                ps.setString(6, u.getType());
                ps.setInt(7, u.getIsResid() ? 1 : 0);
                ps.setString(8, u.getLogin());
                ps.setString(9, u.getMpd());
               
 
                int r= ps.executeUpdate();
//               con.close();
                return r;
           
        }
 


public void delete(int id){
   
 
             
            try {
             PreparedStatement   ps = (PreparedStatement) con.prepareStatement("DELETE FROM `users` WHERE `idUser`="+id+" ");
            
             ps.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(UsersDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
              
}
	
     
		
	
}
