/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Subsistemas.Sensores;

/**
 *
 * @author Genesis
 */
public class SensorReversa {
    private boolean activado;
    private boolean obstaculoDetectado;

    public boolean isActivado() {
        return activado;
    }
    public boolean isObstaculoDetectado() {
        return obstaculoDetectado;
    }
    
    public SensorReversa() {
        this.activado = false;
        this.obstaculoDetectado = false;
    }

    //Sensor Reversa
    public void activar() {
        activado = true;
    }
    public void desactivar() {
        activado = false;
        obstaculoDetectado = false;
    }
   //Detector de obstaculo
    public void ponerObstaculo() {
        obstaculoDetectado = true;
    }
    public void removerObstaculo() {
        obstaculoDetectado = false;
    }
} 

