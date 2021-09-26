
package controller;

import java.sql.*;
import javax.swing.*;
import model.*;


public class CrearPregunta {
    ModPregunta mp = new ModPregunta();
    ModRespuesta mr = new ModRespuesta();
    
    public void Guardar(JTextField TxtCodigo,JTextField TxtCategoria, JTextField TxtPregunta, JTextField TxtRes1, JTextField TxtRes2, 
            JTextField TxtRes3, JTextField TxtRes4, JComboBox Cbx1, JComboBox Cbx2, JComboBox Cbx3, JComboBox Cbx4){
        Connection con = null;
        PreparedStatement ps = null;
        int rows= 0;
        try{
            if(!(TxtCodigo.getText().isEmpty() || TxtPregunta.getText().isEmpty())){
                if(!(TxtCategoria.getText().isEmpty())){
                    // insertar pregunta
                    mp.setCodigo(TxtCodigo.getText());
                    mp.setCategoria(TxtCategoria.getText());
                    mp.setPregunta(TxtPregunta.getText());
                    con = Conexion.getConnection();
                    ps= con.prepareStatement("insert into preguntas (codigo, categoria, pregunta) values(?,?,?)");
                    ps.setString(1, mp.getCodigo());
                    ps.setString(2, mp.getCategoria());
                    ps.setString(3, mp.getPregunta());
                    rows= ps.executeUpdate();
                    // insertar primera respuesta
                    mr.setCodigoP(mp.getCodigo());
                    mr.setCategoria(mp.getCategoria());
                    mr.setRespuesta(TxtRes1.getText());
                    mr.setBandera(Cbx1.getSelectedItem().toString());
                    ps= con.prepareStatement("insert into respuestas (codigo, categoria, respuesta, bandera) values(?,?,?,?)");
                    ps.setString(1, mp.getCodigo());
                    ps.setString(2, mp.getCategoria());
                    ps.setString(3, mr.getRespuesta());
                    ps.setString(4, mr.getBandera());
                    rows= ps.executeUpdate();
                    // insertar segunda respuesta
                    mr.setCodigoP(mp.getCodigo());
                    mr.setCategoria(mp.getCategoria());
                    mr.setRespuesta(TxtRes2.getText());
                    mr.setBandera(Cbx2.getSelectedItem().toString());
                    ps= con.prepareStatement("insert into respuestas (codigo, categoria, respuesta, bandera) values(?,?,?,?)");
                    ps.setString(1, mp.getCodigo());
                    ps.setString(2, mp.getCategoria());
                    ps.setString(3, mr.getRespuesta());
                    ps.setString(4, mr.getBandera());
                    rows= ps.executeUpdate();
                    // insertar tercera respuesta
                    mr.setCodigoP(mp.getCodigo());
                    mr.setCategoria(mp.getCategoria());
                    mr.setRespuesta(TxtRes3.getText());
                    mr.setBandera(Cbx3.getSelectedItem().toString());
                    ps= con.prepareStatement("insert into respuestas (codigo, categoria, respuesta, bandera) values(?,?,?,?)");
                    ps.setString(1, mp.getCodigo());
                    ps.setString(2, mp.getCategoria());
                    ps.setString(3, mr.getRespuesta());
                    ps.setString(4, mr.getBandera());
                    rows= ps.executeUpdate();
                    // insertar cuarta respuesta
                    mr.setCodigoP(mp.getCodigo());
                    mr.setCategoria(mp.getCategoria());
                    mr.setRespuesta(TxtRes4.getText());
                    mr.setBandera(Cbx4.getSelectedItem().toString());
                    ps= con.prepareStatement("insert into respuestas (codigo, categoria, respuesta, bandera) values(?,?,?,?)");
                    ps.setString(1, mp.getCodigo());
                    ps.setString(2, mp.getCategoria());
                    ps.setString(3, mr.getRespuesta());
                    ps.setString(4, mr.getBandera());
                    rows= ps.executeUpdate();
                    
                }else{
                    JOptionPane.showMessageDialog(null, "falta un campo por llenar");
                }
            }else{
                JOptionPane.showMessageDialog(null, "falta un campo por llenar");
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "no se pudo crear la pregunta, falta un campo por llenar");
        }
    }
}
