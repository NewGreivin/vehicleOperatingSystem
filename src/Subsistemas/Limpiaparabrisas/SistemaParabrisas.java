/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Subsistemas.Limpiaparabrisas;

import Subsistemas.Encendido.EstadoEncendido;
import Subsistemas.Encendido.SistemaEncendido;

/**
 *
 * @author Marisol
 */
public class SistemaParabrisas {
    private ParabrisasVelocidad velocidadActual;
    private SistemaEncendido sistemaEncendido;
    
    public ParabrisasVelocidad getVelocidadActual(){
        return velocidadActual;
    }
    
    public SistemaParabrisas(SistemaEncendido sistemaEncendido){
        this.sistemaEncendido = sistemaEncendido;
        this.velocidadActual = ParabrisasVelocidad.APAGADA;
    }
    
    public void cambiarVelocidad(ParabrisasVelocidad nuevaVelocidad){
        if (sistemaEncendido.getEstado() == EstadoEncendido.ENCENDIDO) {
            this.velocidadActual = nuevaVelocidad;
            System.out.println("La velocidad del limpiaparabrisas se cambio a: " + nuevaVelocidad.getDescripcion());
        } else {
            System.out.println("No se puede cambiar la velocidad. El sistema de encendido esta apagado.");
        }
    }
    
    public void detener(){
     if (sistemaEncendido.getEstado() == EstadoEncendido.ENCENDIDO) {
            this.velocidadActual = ParabrisasVelocidad.APAGADA;
            System.out.println("Limpiaparabrisas apagado");
        } else {
            System.out.println("El sistema de encendido esta apagado. El limpiaparabrisas ya esta inactivo.");
        }
    }
}
