/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Subsistemas.Sensores;

/**
 *
 * @author Genesis
 */
public class SensorFrenoMano {
    private boolean activado;

    public boolean isActivado() {
        return activado;
    }

    public SensorFrenoMano() {
        this.activado = true;
    }

    public void quitarFreno() {
        activado = false;
    }

    public void ponerFreno() {
        activado = true;
    }
}

