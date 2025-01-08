/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author USER
 */
public class MyJDBConnection {

     private static Connection con;
    public static Connection createDBConnection()
    {   
        try
        {
            con=DriverManager.getConnection("jdbc:mysql://localhost/coursework","root","");
        }
        catch(SQLException e)
        {
            System.err.println(e.getMessage());
        }
    return con;
    }
    
}
