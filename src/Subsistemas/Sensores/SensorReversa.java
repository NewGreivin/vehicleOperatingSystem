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

    public SensorReversa() {
        this.activado = false;
    }

    public void activar() {
        activado = true;
        System.out.println("Sensor de reversa activado.");
    }

    public void desactivar() {
        activado = false;
        System.out.println("Sensor de reversa desactivado.");
    }

    public boolean estaActivo() {
        return activado;
    }
}
