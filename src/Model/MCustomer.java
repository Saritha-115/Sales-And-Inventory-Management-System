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
public class MCustomer {
     int stock1 = 0;
     private int id;
     private int n = 1;
    public void autoIncrement(){
        try{
         String auto = "select * from tbl_customer order by cust_id desc limit 1";
           Statement st1=MyJDBConnection.createDBConnection().createStatement();
           ResultSet rs = st1.executeQuery(auto);
            if(rs.next()){
                 id = rs.getInt(1);
                 n  = id+1;
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage(),"Database Error",JOptionPane.INFORMATION_MESSAGE);
        } 
    }
    public MCustomer(){
            autoIncrement();
        }
     public int getId(){
        return n;
    }
     public void add(String firstName,String lastName,int contact)
    {
       try
       {
             if(firstName.isEmpty()){
            JOptionPane.showMessageDialog(null, "First name cannot be empty", "Error", JOptionPane.ERROR_MESSAGE);
        }
            
        else if(lastName.isEmpty() ){
            JOptionPane.showMessageDialog(null, "Last name cannot be empty", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else if(contact == 0 ){
            JOptionPane.showMessageDialog(null, "Contact cannot be empty", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else if(contact < 10 && contact >10){
            JOptionPane.showMessageDialog(null, "Please enter a valid contact number", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            Statement st=MyJDBConnection.createDBConnection().createStatement();
                int row_count = st.executeUpdate("INSERT INTO tbl_customer (cust_id, first_name, last_name,contact) VALUES ('" + n + "', '" + firstName + "', '" + lastName + "','" + contact + "')");
                if(row_count>0)
            {
                JOptionPane.showMessageDialog(null,"Customer added successfully","Customer",JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Adding failed","Customer",JOptionPane.INFORMATION_MESSAGE);
            }
        }
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage(),"Database Error",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    public ResultSet populate(){
        try{
            Statement st=MyJDBConnection.createDBConnection().createStatement();
            String q = "select * from tbl_customer";
            return st.executeQuery(q);
           }catch(SQLException e){
               JOptionPane.showMessageDialog(null,e.getMessage(),"Database Error",JOptionPane.INFORMATION_MESSAGE);
               return null;
           }
    }
    public void edit(int id,String firstName,String lastName,int contact)
    {
        try{
         if(firstName.isEmpty()){
            JOptionPane.showMessageDialog(null, "First name cannot be empty", "Error", JOptionPane.ERROR_MESSAGE);
        }
            
        else if(lastName.isEmpty() ){
            JOptionPane.showMessageDialog(null, "Last name cannot be empty", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else if(contact == 0 ){
            JOptionPane.showMessageDialog(null, "Contact cannot be empty", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            Statement st=MyJDBConnection.createDBConnection().createStatement();
            int row_count = st.executeUpdate("update tbl_customer set first_name='" + firstName + "',last_name='" + lastName + "',contact='" +contact+ "' where cust_id='" +id+ "'");
                if(row_count>0)
            {
                JOptionPane.showMessageDialog(null,"Customer updated successfully","Customer",JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Editing failed","Customer",JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage(),"Database Error",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
     public void delete(int id)
    {
        try{
            Statement st=MyJDBConnection.createDBConnection().createStatement();
            int row_count = st.executeUpdate("delete from tbl_customer where cust_id='" +id+ "'");
                if(row_count>0)
            {
                JOptionPane.showMessageDialog(null,"Customer deleted successfully","Customer",JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Deleting failed","Customer",JOptionPane.INFORMATION_MESSAGE);
            }
    }catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage(),"Database Error",JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
