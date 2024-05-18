//    

import java.sql.Connection;

import java.sql.DriverManager;

import java.util.logging.Level;

import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*

* To change this license header, choose License Headers in Project Properties.

* To change this template file, choose Tools | Templates

* and open the template in the editor.

*/

/**

*

* @author halamansour

*/

public class myConnection {

public static Connection getConnection() {

Connection con = null ;

try {

Class.forName("com.mysql.jdbc.Driver");

  con = DriverManager.getConnection ("jdbc:mysql://localhost:8889/School_online_system", "root", "root" );
  
  
  
} catch (Exception ex) {

System.out.println(ex.getMessage());

}

return con;

}

}
















