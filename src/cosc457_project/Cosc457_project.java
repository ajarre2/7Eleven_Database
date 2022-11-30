/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cosc457_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author egray14
 */
public class Cosc457_project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String userID = "egray14";
        String pass = "COSC*fp7wz";
        String SERVER = "jdbc:mysql://triton.towson.edu:3360/?serverTimezone=EST#/egray14db";
        
        try{
            Connection con = DriverManager.getConnection(SERVER, userID, pass);
            Statement stmt = con.createStatement();
            
            int num = stmt.executeUpdate("INSERT INTO egray14db.Address VALUES(null, 'asd', 2)");//
            System.out.println(num);
            
            ResultSet rs = stmt.executeQuery("SELECT * FROM egray14db.Address");
            
            while(rs.next()){
                String bNO = rs.getString("idAddress");
                System.out.println(bNO);
//                  System.out.println();
            }
        }
        catch(SQLException e){
            System.out.println(e);
        }
    }
    
}
