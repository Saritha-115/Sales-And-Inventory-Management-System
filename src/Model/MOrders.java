/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class MOrders {
     public ResultSet populateCustomer(){
        try{
            Statement st=MyJDBConnection.createDBConnection().createStatement();
            String q = "select * from tbl_customer";
            return st.executeQuery(q);
           }catch(SQLException e){
               JOptionPane.showMessageDialog(null,e.getMessage(),"Database Error",JOptionPane.INFORMATION_MESSAGE);
               return null;
           }
    }
     public ResultSet populateProduct(){
        try{
            Statement st=MyJDBConnection.createDBConnection().createStatement();
            String q = "select * from tbl_product";
            return st.executeQuery(q);
           }catch(SQLException e){
               JOptionPane.showMessageDialog(null,e.getMessage(),"Database Error",JOptionPane.INFORMATION_MESSAGE);
               return null;
           }
    }
    public static String formatToISO8601() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDateTime now = LocalDateTime.now();
        return dtf.format(now);
    }
    public void add(int id,int quantity,int inventId)
    {
       try
       {
           int row_count1 = 0;
           int row_count =0;
            Statement st=MyJDBConnection.createDBConnection().createStatement();
            String q = "select quntity from tbl_product where p_id = '"+id+"'";
            ResultSet rs = st.executeQuery(q);
            if(rs.next()){
                int stock = rs.getInt(1);
                stock = stock - quantity;
                row_count1 = st.executeUpdate("update tbl_product set quntity = '"+stock+"' where p_id = '"+id+"'");
            }
            String p = "select qty_in_st from tbl_inventory where inventory_id = '"+inventId+"'";
            ResultSet rs1 = st.executeQuery(p);
            if(rs1.next()){
                int stock = rs1.getInt(1);
                stock = stock - quantity;
                row_count = st.executeUpdate("update tbl_inventory set qty_in_st = '"+stock+"' where inventory_id = '"+inventId+"'");
            }

                if(row_count>0 && row_count1>0)
            {
                JOptionPane.showMessageDialog(null,"Item added successfully","Orders",JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Adding failed","Orders",JOptionPane.INFORMATION_MESSAGE);
            }
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage(),"Database Error",JOptionPane.INFORMATION_MESSAGE);
        }
    }
     private int id;
     private int n = 1;
    public void autoIncrement(){
        try{
         String auto = "select * from tbl_sales_order order by order_id desc limit 1";
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
    public MOrders(){
            autoIncrement();
        }
     public int getId(){
        return n;
    }
    public void addSalesOrder(String date,int totPrice,int custId){
        
       try
       {
         if(custId == 0){
            JOptionPane.showMessageDialog(null, "Select customer", "Error", JOptionPane.ERROR_MESSAGE);
        }
         else if(totPrice == 0){
             JOptionPane.showMessageDialog(null, "Select customer", "Error", JOptionPane.ERROR_MESSAGE);
         }
         else if(totPrice == 0){
             JOptionPane.showMessageDialog(null, "Select customer", "Error", JOptionPane.ERROR_MESSAGE);
         }
        else{
             int payId= 0;
            Statement st=MyJDBConnection.createDBConnection().createStatement();
                int row_count = st.executeUpdate("INSERT INTO tbl_sales_order (order_id, order_date, t_price,cust_id,pay_id) VALUES ('" + n + "', '" + date + "', '" + totPrice + "','" + custId + "','" + payId + "')");
                if(row_count>0)
            {
                JOptionPane.showMessageDialog(null,"Sales Order added successfully","Orders",JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Adding failed","Orders",JOptionPane.INFORMATION_MESSAGE);
            }
        }
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage(),"Database Error",JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
