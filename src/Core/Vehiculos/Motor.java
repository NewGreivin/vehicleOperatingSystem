/**
 * @author Greivin
 */
package Core.Vehiculos;

import Interfaces.Activable;

public class Motor implements Activable{
    private boolean encendido;
    private int revoluciones;  // en RPM

    public boolean isEncendido() {
        return encendido;
    }
    public int getRevoluciones() {
        return revoluciones;
    }

    public void setRevoluciones(int revoluciones) {
        this.revoluciones = revoluciones;
    }
    
    public Motor() {
        this.revoluciones = 0;
        this.encendido = false;
    }
    
    @Override
    public void encender() {
        this.encendido = true;
        revoluciones = 800;
    }

    @Override
    public void apagar() {
        this.encendido = false;
        revoluciones = 0;
    }
    
    public void aumentarRevoluciones(int cantidadRevolu) {
        if (encendido) {
            revoluciones += cantidadRevolu;
            if (revoluciones > 7000) revoluciones = 7000;
        }
    }

    public void disminuirRevoluciones(int cantidadRevolu) {
        if (encendido) {
            revoluciones -= cantidadRevolu;
            if (revoluciones < 800) revoluciones = 800;
        }
    }
    
}