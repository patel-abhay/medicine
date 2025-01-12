/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import db.DBconnector;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Lenovo
 */
public class Doctorauthentication { 
     public boolean islogin(String username, String password) 
    {

        String tablePassword=""; 
       try  
       {
           Statement st = DBconnector.getStatement();
           String query = "SELECT * from user where username='"+username+"'"; 
           ResultSet rs = st.executeQuery(query);                                   
          
           if(rs.next()) 
           { 
               tablePassword = rs.getString("password"); 
                
           }  
           else 
           {
               return false;
           }
       } 
       catch(SQLException e) 
       {
           System.out.println(e);
       }
      
     
    if(password.equals(tablePassword))
       { 
           return true;
       } 
         return false;
    }        
    
    
}
