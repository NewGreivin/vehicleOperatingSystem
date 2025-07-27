/**
 * @author Greivin
 */
package Subsistemas.kilometraje;

import Core.Vehiculos.Motor;

public class TacometroRPM {
    private Motor motor;

    public int getMotorRevoluciones() {
        return motor.getRevoluciones();
    }

    public TacometroRPM(Motor motor) {
        this.motor = motor;
    }

    @Override
    public String toString() {
        return motor.getRevoluciones() + "";
    }

}
