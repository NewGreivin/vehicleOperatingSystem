/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Subsistemas.Alarmas;

import Interfaces.Activable;

/**
 *
 * @author UTN
 */
public class SistemaAlarma extends ControlAlarma implements Activable{

    public SistemaAlarma(boolean activa) {
        super(activa);
    }

    @Override
    public void encender() {
        this.activarAlarma();
    }

    @Override
    public void apagar() {
        this.desactivarAlarma();
    }

}
