/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package storemgmt;
import java.sql.*;
/**
 *
 * @author imabeliever
 */
public class Storemgmt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws SQLException{
        // TODO code application logic here
        OpenDatabseConnection();
        
        
        }
    private static void OpenDatabseConnection() throws SQLException{
        System.out.println("connecting to database...");
       Connection connect = DriverManager.getConnection("jdbc:mariadb://localhost:3306/bms","root","mahesh1564");
        System.out.println("connection valid :"+connect.isValid(5));
    }
    }
    
