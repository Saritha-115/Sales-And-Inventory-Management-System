/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Model.MOrders;
import java.sql.ResultSet;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author USER
 */
public class COrders {
     public ResultSet populateCustomer(){
         MOrders customer = new MOrders();
         ResultSet resultSet = customer.populateCustomer();
         return resultSet;
    }
     public ResultSet populateProduct(){
         MOrders product = new MOrders();
         ResultSet resultSet = product.populateProduct();
         return resultSet;
    }
     public String getDate(){
         MOrders date = new MOrders();
         return date.formatToISO8601();
     }
     public void add(int id,int quantity,int inventId){
         MOrders Item = new MOrders();
         Item.add(id,quantity,inventId);
     }
      private int n = 1;
     
     public COrders(){
         autoIncrement();
     }
     public void autoIncrement(){
         MOrders m = new MOrders();
         n = m.getId();
     }
     public int getId(){
        return n;
    }
     public void addSalesOrder(String date,int totPrice,int custId){
          MOrders addOrder = new MOrders();
         addOrder.addSalesOrder(date,totPrice,custId);
     }
}
