/**
 * @author Greivin
 */
package Subsistemas.Transmicion;

import Core.Vehiculos.Motor;

public class PedalAcelerador extends Pedal {
    
private boolean presionado;

    public boolean isPresionado() {
        return presionado;
    }

    public PedalAcelerador(Motor motor) {
        super(motor);
        this.presionado = false;
    }

    @Override
    public void presionar() {
        if (motor.isEncendido()) {
            motor.aumentarRevoluciones(500); // cada presión aumenta 500 RPM
            presionado = true;
        }
    }

    @Override
    public void soltar() {
        if (motor.isEncendido()) {
            motor.disminuirRevoluciones(300); // al soltar disminuye RPM
            presionado = false;
        }
    }
    
}