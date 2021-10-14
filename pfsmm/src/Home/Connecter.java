/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Home;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author DELL
 */
public class Connecter {
        Connection con ;
    public Connecter(){
     try{
     Class.forName("com.mysql.jdbc.Driver");
     System.out.println("yes");
     /*Date d = new Date();
     System.out.println(d.getDay());*/
    }catch(ClassNotFoundException e)
    {
        System.err.println(e);
    }
    
    try{
           //con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost/3306/etud","root","");
           //localhost:3306/etud?zeroDateTimeBehavior=convertToNull [root on Default schema]
           con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/GESTION_DE_STOCK","root","");
           if(con != null){
               System.out.println("yesssss");
               
           }
           System.out.println("yesssss");
    }catch(SQLException es)
    {
        System.err.println(es);
    }
    
    } 
    Connection obtenirconnexion(){
        return con;
    } 
    
}
