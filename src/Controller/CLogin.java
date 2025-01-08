/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.MLogin;
import java.sql.ResultSet;
/**
 *
 * @author USER
 */
public class CLogin {
    ResultSet rs;
     public void login(int userId,String password){
          MLogin login = new MLogin();
          login.login(userId, password);
      }
     public  ResultSet getResult(){
            MLogin login = new MLogin();
            return rs = login.getResult();
        }
}
