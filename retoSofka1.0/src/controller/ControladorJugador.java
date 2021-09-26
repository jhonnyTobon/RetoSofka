package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Random;
import javax.swing.*;
import model.Conexion;

public class ControladorJugador {

    String name;
    int puntaje;
    int nivel;
    int randomIndex = 0;
    String[] codigos = new String[5];
    String res1 = null;
    String res2 = null;
    String res3 = null;
    String res4 = null;

    public void Escribir() {
        String dato = traerPreguntas1();
        System.out.println(dato);
        
        
    }

    public void nombre(String usuario) {
        name = usuario;
        puntaje = 0;
        nivel = 0;
    }

    public String traerPreguntas1() {

        Random random = new Random();
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String pregunta = null;
        String codigo = null;

        try {
            con = Conexion.getConnection();
            ps = con.prepareStatement("SELECT codigo from preguntas where categoria= ?");
            ps.setString(1, String.valueOf(1));
            rs = ps.executeQuery();
            int i = 0;
            ResultSetMetaData rsmd = rs.getMetaData();

            while (rs.next()) {

                try {
                    codigo = rs.getString("codigo");
                    codigos[i] = codigo;
                    i++;

                } catch (SQLException ex) {
                    System.out.println(ex);
                }

            }

        } catch (Exception e) {
            System.out.println(e);
        }
        randomIndex = random.nextInt(codigos.length - 1);

        try {
            con = Conexion.getConnection();
            ps = con.prepareStatement("SELECT pregunta from preguntas where codigo= ?");
            ps.setString(1, codigos[randomIndex]);
            rs = ps.executeQuery();

            ResultSetMetaData rsmd = rs.getMetaData();

            while (rs.next()) {
                pregunta = rs.getString("pregunta");
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        return pregunta;
    }

    public void traerRespuestas() {

        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            con = Conexion.getConnection();
            ps = con.prepareStatement("SELECT respuesta from respuestas where codigo= ?");
            ps.setString(1, codigos[randomIndex]);
            rs = ps.executeQuery();

            ResultSetMetaData rsmd = rs.getMetaData();

            while (rs.next()) {

                res1 = rs.getString("respuesta");
                String res2 = null;
                String res3 = null;
                String res4 = null;

            }

        } catch (Exception e) {
            System.out.println(e);
        }

        
    }

}
