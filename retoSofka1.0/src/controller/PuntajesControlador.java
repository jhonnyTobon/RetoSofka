package controller;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import model.Conexion;

public class PuntajesControlador {

    public void llenarPuntajes(JTable TbPuntajes) {
        DefaultTableModel modelo = (DefaultTableModel) TbPuntajes.getModel();
        modelo.setRowCount(0);
        //ModeloCliente mu = new ModeloCliente();
        Object[] users = null;
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            con = Conexion.getConnection();
            ps = con.prepareStatement("SELECT * from puntajes");
            rs = ps.executeQuery();
            //System.out.println("hola");
            ResultSetMetaData rsmd = rs.getMetaData();
            int cantCol = rsmd.getColumnCount();
            //System.out.println(cantCol);
            while (rs.next()) {
                users = new Object[cantCol];
                for (int i = 0; i < cantCol; i++) {
                    try {
                        users[i] = rs.getObject(i + 1);
                    } catch (SQLException ex) {
                        System.out.println(ex);
                    }
                }
            modelo.addRow(users);
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public void crearUser(String usuario){
        Connection con = null;
        PreparedStatement ps = null;
        int rows = 0;
        try {
            con = Conexion.getConnection();
            ps = con.prepareStatement("insert into puntajes (nombre, puntaje, nivel) values (?,0,0)");
            ps.setString(1, usuario);
            rows =  ps.executeUpdate();
            
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        } catch (SQLException ex1) {
            System.out.println(ex1);
        }
        
    }
}
