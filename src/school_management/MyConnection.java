/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school_management;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import static java.lang.Class.forName;
/**
 *
 * @author franky
 */
public class MyConnection {
     public static Connection getConnection(){
    Connection con = null;
    try
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school management ","root", "");
        System.out.println("connection success");
        
    } 
    catch (ClassNotFoundException | SQLException ex)
    {
        
        System.out.println(ex);
    }
    return con;
    }
    
}
