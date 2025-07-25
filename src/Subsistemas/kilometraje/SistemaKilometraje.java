/**
 * @author Greivin
 */
package Subsistemas.kilometraje;

import Interfaces.Informacion;

public class SistemaKilometraje implements Informacion {
    private Odometro odometro;
    private Velocimetro velocimetro;
    private TacometroRPM tacometro;

    public void setOdometro(Odometro odometro) {
        this.odometro = odometro;
    }

    public void setVelocimetro(Velocimetro velocimetro) {
        this.velocimetro = velocimetro;
    }

    public void setTacometro(TacometroRPM tacometro) {
        this.tacometro = tacometro;
    }

    public SistemaKilometraje() {
        this.odometro = new Odometro();
        this.velocimetro = new Velocimetro();
        this.tacometro = new TacometroRPM();
    }

    @Override
    public String estadoActual() {
         throw new UnsupportedOperationException("Not supported yet."); //Falta definir el mensaje a la hora del interfaz
    }

}
