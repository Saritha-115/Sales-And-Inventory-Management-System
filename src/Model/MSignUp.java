/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class MSignUp {
      private int id;
     private int n = 1;
    public void autoIncrement(){
        try{
         String auto = "select * from tbl_users order by user_id desc limit 1";
           Statement st1=MyJDBConnection.createDBConnection().createStatement();
           ResultSet rs = st1.executeQuery(auto);
            if(rs.next()){
                 id = rs.getInt(1);
                 n  = id+1;
            }
        }
        catch(Exception e){
            System.err.println(e.getMessage());
        }
        
    }
    public MSignUp(){
            autoIncrement();
        }
    public int getId(){
        return n;
    }
     public void register(String username,String password,int userRoll)
    {
       try
       {
             if(username.isEmpty()){
            JOptionPane.showMessageDialog(null, "User name cannot be empty", "Error", JOptionPane.ERROR_MESSAGE);
        }
            
        else if(password.isEmpty() ){
            JOptionPane.showMessageDialog(null, "Password cannot be empty", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            Statement st=MyJDBConnection.createDBConnection().createStatement();
            int row_count = st.executeUpdate("INSERT INTO tbl_users (user_id, user_name, password,roll_id) VALUES ('" + n + "', '" + username + "', '" + password + "','" + userRoll + "')");
            if(row_count>0)
            {
                JOptionPane.showMessageDialog(null,"User registered","SignUp",JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Registration failed","SignUp",JOptionPane.ERROR_MESSAGE);
            }
        }
        }
        catch(SQLException e)
        {
            System.err.println(e.getMessage());
        }
    
    }
}
