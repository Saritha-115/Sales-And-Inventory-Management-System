/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.MSignUp;

/**
 *
 * @author USER
 */
public class CSignUp {
     public void register(String username,String password,int userRoll){
          MSignUp signUp = new MSignUp();
          signUp.register(username, password,userRoll);
    }   
}
