/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2.java;

import java.sql.Connection;
import java.sql.*;

/**
 *
 * @author Alex
 */
public class Login {
    public static void main(String[]args){
        Connection conn = null;
        
        try{
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","hello123");
            
            if(conn != null){
                System.out.println("connected");
            }
        }
        catch(Exception e){
            System.err.println("not connected");
        }
    }
}
