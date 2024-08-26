/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Dao.UsersDAO;
import Models.Users;

/**
 *
 * @author PC
 */
public class LoginController {
    Users user ;
    UsersDAO userdao ;

    public LoginController() {
           userdao = new  UsersDAO();
           user = new Users();
           user.setType("client");
           

    }
    
    

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public UsersDAO getUserdao() {
        return userdao;
    }

    public void setUserdao(UsersDAO userdao) {
        this.userdao = userdao;
    }

  
    
    
    
}
