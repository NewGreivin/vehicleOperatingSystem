/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Subsistemas.Alarmas;

import Interfaces.Controlable;

/**
 *
 * @author UTN
 */
public class SistemaAlarma extends ControlAlarma implements Controlable{

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

    @Override
    public void abrir() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void cerrar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
