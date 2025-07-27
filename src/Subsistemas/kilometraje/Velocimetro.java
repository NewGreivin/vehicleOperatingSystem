/**
 * @author Greivin
 */
package Subsistemas.kilometraje;

import Subsistemas.Transmicion.SistemaTransmicion;

public class Velocimetro {
    private SistemaTransmicion transmision;

    public int getTransmision() {
        return transmision.getVelocidad();
    }
    
    public Velocimetro(SistemaTransmicion transmision) {
        this.transmision = transmision;
    }

    @Override
    public String toString() {
        return transmision.getVelocidad() + "";
    }
    
}
