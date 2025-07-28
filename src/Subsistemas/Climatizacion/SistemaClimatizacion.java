/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Subsistemas.Climatizacion;

import Interfaces.Activable;
import Subsistemas.Encendido.EstadoEncendido;
import Subsistemas.Encendido.SistemaEncendido;

/**
 *
 * @author UTN
 */

public class SistemaClimatizacion implements Activable {
    private boolean encendido;
    private ModoClimatizacion modoActual;
    private VelocidadVentilador velocidadActual;
    private int temperatura;
    private SistemaEncendido sistemaEncendido;

    public boolean isEncendido() {
        return encendido;
    }
    public ModoClimatizacion getModoActual() {
        return modoActual;
    }
    public VelocidadVentilador getVelocidadActual() {
        return velocidadActual;
    }
    public int getTemperatura() {
        return temperatura;
    }

    public void setModoActual(ModoClimatizacion newModo) {
        this.modoActual = newModo;
    }
 
    public void setVelocidadActual(VelocidadVentilador newVelocidad) {
        this.velocidadActual = newVelocidad;
    }
    public void setTemperatura(int newTemperatura) {
        this.temperatura = newTemperatura;
    }

    public SistemaClimatizacion(SistemaEncendido sistemaEncendido) {
        this.encendido = false;
        this.modoActual = ModoClimatizacion.VENTILACION;
        this.velocidadActual = VelocidadVentilador.OFF;
        this.temperatura = 22; //Grados
        this.sistemaEncendido = sistemaEncendido;
    }

    @Override
    public void encender() {
        if (sistemaEncendido.getEstado() == EstadoEncendido.ENCENDIDO) {
            encendido = true;
        }
    }

    @Override
    public void apagar() {
        encendido = false;
        velocidadActual = VelocidadVentilador.OFF;
    }

}

