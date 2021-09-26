
package model;

/**
 *
 * @author jhonny
 */
public class ModJugador {
    String nombre;
    int puntaje;
    int nivel;

    public ModJugador() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return "ModJugador{" + "nombre=" + nombre + ", puntaje=" + puntaje + ", nivel=" + nivel + '}';
    }
    
    
}
