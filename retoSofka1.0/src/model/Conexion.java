/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.*;


/**
 *
 * @author jhonny
 */
public class Conexion {
   
    
    
    public static Connection getConnection() throws ClassNotFoundException{
        
            Connection con = null;
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/retoSofka?serverTimezone=UTC","root", "" );
                //JOptionPane.showMessageDialog(null, "conexion exitosa");
            } catch ( SQLException ex) {
                ex.printStackTrace(System.out);
            }
    
    
        return con;
    }
    
    public static void close(Connection con) throws SQLException{
        con.close();
        //JOptionPane.showMessageDialog(null, "conexion cerrada");
    }
}
