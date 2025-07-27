/**
 * @author Greivin
 */
package Subsistemas.kilometraje;

import Core.Vehiculos.Motor;
import Subsistemas.Transmicion.SistemaTransmicion;

public class SistemaKilometraje {
    private Odometro odometro;
    private Velocimetro velocimetro;
    private TacometroRPM tacometro;

    public Odometro getOdometro() {
        return odometro;
    }
    public Velocimetro getVelocimetro() {
        return velocimetro;
    }
    public TacometroRPM getTacometro() {
        return tacometro;
    }

    public SistemaKilometraje(SistemaTransmicion transmision, Motor motor) {
        this.odometro = new Odometro();
        this.velocimetro = new Velocimetro(transmision);
        this.tacometro = new TacometroRPM(motor);
    }

    public void actualizar() {
        odometro.setAddkmRecorridos(velocimetro.getTransmision());
        velocimetro.getTransmision();
        tacometro.getMotorRevoluciones();
    }

}
