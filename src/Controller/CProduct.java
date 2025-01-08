/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import Model.MProduct;

/**
 *
 * @author USER
 */
public class CProduct {
      
     private int n = 1;
     
     public CProduct(){
         autoIncrement();
     }
     public void autoIncrement(){
         MProduct m = new MProduct();
         n = m.getId();
     }
     public int getId(){
        return n;
    }
    public void add(String name,String discription,int price,int quantity,int inventoryId){
        MProduct product = new MProduct();
        product.add(name,discription,price,quantity,inventoryId);
    }
    public void edit(int id,String name,String discription,int price,int quantity,int inventoryId){
        MProduct product = new MProduct();
        product.edit(id,name,discription,price,quantity,inventoryId);
    }
    public void delete(int id,int inventoryId){
        MProduct product = new MProduct();
        product.delete(id,inventoryId);
    }
    public ResultSet populate(){
         MProduct product = new MProduct();
         ResultSet resultSet = product.populate();
         return resultSet;
    }
}
