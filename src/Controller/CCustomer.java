/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.MCustomer;
import java.sql.ResultSet;
/**
 *
 * @author USER
 */
public class CCustomer {
    private int n = 1;
     
     public CCustomer(){
         autoIncrement();
     }
     public void autoIncrement(){
         MCustomer m = new MCustomer();
         n = m.getId();
     }
     public int getId(){
        return n;
    }
    public void add(String firstName,String lastName,int contact){
        MCustomer customer = new MCustomer();
        customer.add(firstName,lastName,contact);
    }
    public void edit(int id,String firstName,String lastName,int contact){
        MCustomer customer = new MCustomer();
        customer.edit(id,firstName,lastName,contact);
    }
    public void delete(int id){
        MCustomer customer = new MCustomer();
        customer.delete(id);
    }
    public ResultSet populate(){
         MCustomer customer = new MCustomer();
         ResultSet resultSet = customer.populate();
         return resultSet;
    }
}
