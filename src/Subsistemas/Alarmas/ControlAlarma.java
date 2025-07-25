/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Subsistemas.Alarmas;

/**
 *
 * @author UTN
 */
public class ControlAlarma {
    private boolean activa;

    public boolean isActiva() {
        return activa;
    }
    
    public ControlAlarma(boolean activa) {
        this.activa = activa;
    }

    public void activarAlarma() {
        activa = true;
    }

    public void desactivarAlarma() {
        activa = false;
    }

}
