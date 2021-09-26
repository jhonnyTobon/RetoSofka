
package model;

/**
 *
 * @author jhonny
 */
public class ModRespuesta {
    String codigoP;
    String respuesta;
    String bandera;
    String categoria;

    public ModRespuesta() {
    }

    public String getCodigoP() {
        return codigoP;
    }

    public void setCodigoP(String codigoP) {
        this.codigoP = codigoP;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public String getBandera() {
        return bandera;
    }

    public void setBandera(String bandera) {
        this.bandera = bandera;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "ModRespuesta{" + "codigoP=" + codigoP + ", respuesta=" + respuesta + ", bandera=" + bandera + ", categoria=" + categoria + '}';
    }
    
    
    
    
    
}
