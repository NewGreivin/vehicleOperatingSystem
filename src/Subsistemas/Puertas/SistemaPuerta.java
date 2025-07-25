/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Subsistemas.Puertas;

import Interfaces.Controlable;
import Interfaces.Informacion;

/**
 *
 * @author UTN
 */
    public class SistemaPuerta extends Puerta implements Controlable {

    public SistemaPuerta(boolean puerta) {
        super(puerta);
    }

    @Override
    public void encender() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void apagar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Override
    public void abrir() {
        this.abrirPuerta();
    }

    @Override
    public void cerrar() {
        this.cerrarPuerta();
    }
}

