/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Subsistemas.Alarmas;

import Interfaces.Activable;
import Subsistemas.Puertas.SistemaPuerta;

/**
 *
 * @author UTN
 */
public class SistemaAlarma extends ControlAlarma implements Activable{
    private SistemaPuerta puertaIzquierda;
    private SistemaPuerta puertaDerecha;

    public SistemaAlarma(boolean activa) {
        super(activa);
    }

    public void setPuertas(SistemaPuerta izquierda, SistemaPuerta derecha) {
        this.puertaIzquierda = izquierda;
        this.puertaDerecha = derecha;
    }

    @Override
    public void encender() {
        if ((puertaIzquierda != null && puertaIzquierda.isPuerta()) ||
            (puertaDerecha != null && puertaDerecha.isPuerta())) {
            System.out.println("No se puede activar la alarma: hay puertas abiertas.");
        } else {
            this.activarAlarma();
            System.out.println("Alarma activada.");
        }
    }

    @Override
    public void apagar() {
        this.desactivarAlarma();
        System.out.println("Alarma desactivada");
    }
    
}