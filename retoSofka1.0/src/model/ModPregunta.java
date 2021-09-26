
package model;

/**
 *
 * @author jhonny
 */
public class ModPregunta {
    String pregunta;
    String categoria;
    String codigo;

    public ModPregunta() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    
    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "ModPregunta{" + "pregunta=" + pregunta + ", categoria=" + categoria + ", codigo=" + codigo + '}';
    }
    
    
    
}
