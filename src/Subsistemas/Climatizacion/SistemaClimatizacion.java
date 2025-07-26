/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Subsistemas.Climatizacion;

import Interfaces.Activable;

/**
 *
 * @author UTN
 */

public class SistemaClimatizacion implements Activable {
    private boolean encendido;
    private ModoClimatizacion modoActual;
    private VelocidadVentilador velocidadActual;

    public boolean isEncendido() {
        return encendido;
    }

    public ModoClimatizacion getModoActual() {
        return modoActual;
    }

    public VelocidadVentilador getVelocidadActual() {
        return velocidadActual;
    }
    
    
    public void setModoActual(ModoClimatizacion modoActual) {
        if(encendido) {
            this.modoActual = modoActual;
        }
    }

    public void setVelocidadActual(VelocidadVentilador velocidadActual) {
        if(encendido) {
            this.velocidadActual = velocidadActual;
        }
    }
    
    public SistemaClimatizacion() {
        this.encendido = false;
        this.modoActual = ModoClimatizacion.VENTILACION;
        this.velocidadActual = VelocidadVentilador.OFF;
    }

    @Override
    public void encender() {
        encendido = true;
    }

    @Override
    public void apagar() {
        encendido = false;
        velocidadActual = VelocidadVentilador.OFF;
    }

    
}

