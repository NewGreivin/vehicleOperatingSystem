/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Subsistemas.radio;

import Interfaces.Activable;

/**
 *
 * @author Marisol
 */
public class SistemaRadio implements Activable{
    private RadioModo modoActual;
    private boolean encendida;
    
    public SistemaRadio(){
        this.modoActual = RadioModo.FM;
        this.encendida = false;  
    }

    @Override
    public void encender() {
        encendida = true;
        System.out.println("Radio encendido. Modo: " + modoActual.getDescripcion());
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
    
    public boolean estaEncendida(){
        return encendida;
    }

    public RadioModo getModoActual() {
        return modoActual;
    }
    
}
