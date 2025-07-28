/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Subsistemas.radio;

import Interfaces.Activable;
import Subsistemas.Encendido.EstadoEncendido;
import Subsistemas.Encendido.SistemaEncendido;

/**
 *
 * @author Marisol
 */
public class SistemaRadio implements Activable{
    private RadioModo modoActual;
    private boolean encendida;
    private SistemaEncendido sistemaEncendido;

    public RadioModo getModoActual() {
        return modoActual;
    }
    
    public boolean isEncendida(){
        return encendida;
    }
    
    public SistemaRadio(SistemaEncendido sistemaEncendido){
        this.modoActual = RadioModo.FM;
        this.encendida = false; 
        this.sistemaEncendido = sistemaEncendido;
    }

    @Override
    public void encender() {
        if (sistemaEncendido.getEstado() == EstadoEncendido.ENCENDIDO) {
            encendida = true;
            System.out.println("Radio encendida. Modo: " + modoActual.getDescripcion());
        } else {
            encendida = false;
            System.out.println("No se puede encender la radio. El vehículo esta apagado.");
        }
    }       

    @Override
    public void apagar() {
       encendida = false;
       System.out.println("Radio apagado");
    }
    
    public void cambiarModo(RadioModo nuevoModo){
        if(encendida){
            this.modoActual = nuevoModo;
            System.out.println("Se cambio el modo a: " + nuevoModo.getDescripcion());
        }else{
            System.out.println("No se puede cambiar el modo. Radio apagado");
        }
    }
 
    public void verificarApagado() {
        if (sistemaEncendido.getEstado() == EstadoEncendido.APAGADO && encendida) {
            apagar();
       }
    }
}
