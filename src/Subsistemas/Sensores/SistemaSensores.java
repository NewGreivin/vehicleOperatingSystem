/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Subsistemas.Sensores;
import Interfaces.Activable;

/**
 *
 * @author Genesis
 */
public class SistemaSensores implements Activable {
    private boolean activos;

    public SistemaSensores() {
        this.activos = false;
    }

    @Override
    public void encender() {
        activos = true;
        System.out.println("Sensores activados.");
    }

    @Override
    public void apagar() {
        activos = false;
        System.out.println("Sensores desactivados.");
    }

    public String estadoActual() {
        return activos ? "ACTIVOS" : "INACTIVOS";
    }
}
