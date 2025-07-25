/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Subsistemas.Limpiaparabrisas;

/**
 *
 * @author Marisol
 */
public class SistemaParabrisas {
    private ParabrisasVelocidad velocidadActual;
    
    public SistemaParabrisas(){
        this.velocidadActual = ParabrisasVelocidad.APAGADA;
    }
    
    public void cambiarVelocidad(ParabrisasVelocidad nuevaVelocidad){
        this.velocidadActual = nuevaVelocidad;
        System.out.println("La velocidad del limpiaparabrisas se cambio a: " + nuevaVelocidad.getDescripcion());
    }
    
    public void detener(){
        this.velocidadActual = ParabrisasVelocidad.APAGADA;
        System.out.println("Limpiaparabrisas apagado");
    }

    public ParabrisasVelocidad getVelocidadActual() {
        return velocidadActual;
    }
    
}
