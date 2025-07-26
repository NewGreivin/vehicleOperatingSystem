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

    public SensorFrenoMano() {
        this.activado = true;
    }

    public void quitarFreno() {
        activado = false;
        System.out.println("Freno de mano quitado.");
    }

    public void ponerFreno() {
        activado = true;
        System.out.println("Freno de mano activado.");
    }

    public boolean estaActivado() {
        return activado;
    }
}

