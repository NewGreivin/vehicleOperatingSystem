/**
 * @author Greivin
 */
package Subsistemas.Transmicion;

import Core.Vehiculos.Motor;

public class SistemaTransmicion {
    private PosicionTransmision posicion;
    private Motor motor;
    private int velocidad; // velocidad en km/h

    public int getVelocidad() {
        return velocidad;
    }
    public PosicionTransmision getPosicion() {
        return posicion;
    }

    public void setPosicion(PosicionTransmision newPosicion) {
        this.posicion = newPosicion;
    }
    
    public SistemaTransmicion(Motor motor) {
        this.motor = motor;
        this.posicion = PosicionTransmision.PARKING;
        this.velocidad = 0;
    }
    
    public void actualizarVelocidad() {
        if (!motor.isEncendido() || posicion == PosicionTransmision.PARKING|| posicion == PosicionTransmision.NEUTRO) {
           velocidad = 0;
           return; //Es tipo cancelar el proceso (Asi lo interpreto para el uso)
       }
       calcularRevoluciones();
    }
     
     private void calcularRevoluciones() {
         velocidad = (motor.getRevoluciones() - 800) / 100;  // Calcula velocidad aproximada según RPM
        if (velocidad < 0) {
            velocidad = 0;
        }
     }
     
}