/**
 * @author Greivin
 */
package Subsistemas.Transmicion;

public class SistemaTransmicion {
    private PosicionTransmision posicionActual;

    public PosicionTransmision getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(PosicionTransmision posicionActual) {
        this.posicionActual = posicionActual;
    }

    public SistemaTransmicion() { //Constructor
        this.posicionActual = PosicionTransmision.PARKING;
    }
    
     public boolean puedeMoverse() { //Metodo
         return posicionActual == PosicionTransmision.DRIVE || posicionActual == PosicionTransmision.REVERSE;
     }
}