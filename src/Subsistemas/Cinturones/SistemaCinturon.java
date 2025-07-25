/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Subsistemas.Cinturones;

import Interfaces.Controlable;

/**
 *
 * @author UTN
 */
public class SistemaCinturon extends Cinturon implements Controlable {

    public SistemaCinturon(boolean cinturon) {
        super(cinturon);
    }

    @Override
    public void encender() {
        this.encenderCinturon();
    }

    @Override
    public void apagar() {
        this.apagarCinturon();
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
