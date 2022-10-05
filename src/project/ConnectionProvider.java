
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;
import java.sql.*;

/**
 *
 * @author imabeliever
 */
public class ConnectionProvider {
    public static Connection getCon(){
        try {
            Connection con=DriverManager.getConnection("jdbc:mariadb://localhost:3306/bms","root","mahesh1564");
            return con;
        } 
        catch (Exception e) {
            return null;
        }
        

    
}
}
