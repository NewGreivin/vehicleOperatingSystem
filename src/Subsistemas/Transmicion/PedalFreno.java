/**
 * @author Greivin
 */
package Subsistemas.Transmicion;

import Core.Vehiculos.Motor;

public class PedalFreno extends Pedal {

    private boolean presionado;

    public boolean isPresionado() {
        return presionado;
    }
    
    public PedalFreno(Motor motor) {
        super(motor);
        this.presionado = false;
    }

    @Override
    public void presionar() {
        if (motor.isEncendido()) {
            motor.disminuirRevoluciones(700); // frenar baja más las revoluciones
            presionado = true;
        }
    }

    @Override
    public void soltar() {
        presionado = false;
    }

}