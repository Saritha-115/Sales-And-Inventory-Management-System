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
public class MProduct {
    int stock1 = 0;
     private int id;
     private int n = 1;
    public void autoIncrement(){
        try{
         String auto = "select * from tbl_product order by p_id desc limit 1";
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
    public MProduct(){
            autoIncrement();
        }
     public int getId(){
        return n;
    }
     public void add(String name,String discription,int price,int quantity,int inventoryId)
    {
       try
       {
             if(name.isEmpty()){
            JOptionPane.showMessageDialog(null, "Product name cannot be empty", "Error", JOptionPane.ERROR_MESSAGE);
        }
            
        else if(discription.isEmpty() ){
            JOptionPane.showMessageDialog(null, "Discription cannot be empty", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else if(price == 0 ){
            JOptionPane.showMessageDialog(null, "Price cannot be empty", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else if(quantity == 0 ){
            JOptionPane.showMessageDialog(null, "Quantity cannot be empty", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            int row_count1 = 0;
            Statement st=MyJDBConnection.createDBConnection().createStatement();
            String q = "select qty_in_st from tbl_inventory where inventory_id = '"+inventoryId+"'";
            ResultSet rs = st.executeQuery(q);
            if(rs.next()){
                int stock = rs.getInt(1);
                stock = stock + quantity;
                row_count1 = st.executeUpdate("UPDATE tbl_inventory SET qty_in_st = '"+stock+"' WHERE inventory_id = '"+inventoryId+"'");
            }
                int row_count = st.executeUpdate("INSERT INTO tbl_product (p_id, p_name, discription,price,quntity,inventory_id) VALUES ('" + n + "', '" + name + "', '" + discription + "','" + price + "','" + quantity + "','"+inventoryId+"')");

                if(row_count>0 && row_count1>0)
            {
                JOptionPane.showMessageDialog(null,"Product added successfully","Product",JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Adding failed","Product",JOptionPane.ERROR_MESSAGE);
            }
        }
        }
        catch(SQLException e)
        {
            System.err.println(e.getMessage());
        }
    }
    public ResultSet populate(){
        try{
            Statement st=MyJDBConnection.createDBConnection().createStatement();
            String q = "select * from tbl_product";
            return st.executeQuery(q);
           }catch(SQLException e){
               System.err.println(e.getMessage());
               return null;
           }
    }
    public void edit(int id,String name,String discription,int price,int quantity,int inventoryId)
    {
       try
       {  if(name.isEmpty()){
            JOptionPane.showMessageDialog(null, "Product name cannot be empty", "Error", JOptionPane.ERROR_MESSAGE);
        }
            
        else if(discription.isEmpty() ){
            JOptionPane.showMessageDialog(null, "Discription cannot be empty", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else if(price == 0 ){
            JOptionPane.showMessageDialog(null, "Price cannot be empty", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else if(quantity == 0 ){
            JOptionPane.showMessageDialog(null, "Quantity cannot be empty", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            int row_count1 = 0;
            int new_st = 0 ;
            boolean p = false;
            boolean m = false;
            Statement st=MyJDBConnection.createDBConnection().createStatement();
            String q = "select quntity from tbl_product where p_id = '"+id+"'";
            ResultSet rs = st.executeQuery(q);
            if(rs.next()){
                int stock = rs.getInt(1);
                if(stock < quantity){
                    new_st = new_st + (quantity - stock);
                    p = true;
                }
                else if(stock > quantity){
                    new_st = new_st+(stock - quantity);
                    m = true;
                }
                
                
                String r = "select qty_in_st from tbl_inventory where inventory_id = '"+inventoryId+"'";
                ResultSet rs1 = st.executeQuery(r);
                if(rs1.next()){
                     stock1 = rs1.getInt(1);
                    if(p == true){
                        stock1 = stock1 + new_st;
                    }
                    else if(m == true){
                        stock1 = stock1 - new_st;
                    }
                }
                row_count1 = st.executeUpdate("UPDATE tbl_inventory SET qty_in_st = '"+stock1+"' WHERE inventory_id = '"+inventoryId+"'");
            }
            
                int row_count = st.executeUpdate("update tbl_product set p_name='" +name  + "',discription='" + discription + "',price='" + price + "',quntity='" +quantity+ "',inventory_id='" + inventoryId + "' where p_id='" +id+ "'");
                if(row_count1>0 && row_count>0)
            {
                JOptionPane.showMessageDialog(null,"Product updated successfully","Product",JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Updating failed","Product",JOptionPane.ERROR_MESSAGE);
            }
        }
        }
        catch(SQLException e)
        {
            System.err.println(e.getMessage());
        }
    }
    public void delete(int id,int inventoryId){
        try
       {   int row_count1 = 0;
            Statement st=MyJDBConnection.createDBConnection().createStatement();
            String q = "select quntity from tbl_product where p_id = '"+id+"'";
            ResultSet rs = st.executeQuery(q);
            if(rs.next()){
                int stock = rs.getInt(1);
               
                
                
                String r = "select qty_in_st from tbl_inventory where inventory_id = '"+inventoryId+"'";
                ResultSet rs1 = st.executeQuery(r);
                if(rs1.next()){
                     stock1 = rs1.getInt(1);
                     stock1 = stock1 - stock;                  
                }
                row_count1 = st.executeUpdate("UPDATE tbl_inventory SET qty_in_st = '"+stock1+"' WHERE inventory_id = '"+inventoryId+"'");
            }
            
                int row_count = st.executeUpdate("delete from tbl_product where p_id='" +id+ "'");
                if(row_count1>0 && row_count>0)
            {
                JOptionPane.showMessageDialog(null,"Product deleted successfully","Product",JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Deleting failed","Product",JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(SQLException e)
        {
            System.err.println(e.getMessage());
        }
    }
}
