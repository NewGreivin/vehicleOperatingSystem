/**
 * @author Greivin
 */
package Subsistemas.kilometraje;

import Subsistemas.Subsistema;

public class SistemaKilometraje implements Subsistema {
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
    public void encender(Object t) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void apagar(Object t) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String estadoActual() {
         throw new UnsupportedOperationException("Not supported yet."); //Falta definir el mensaje a la hora del interfaz
    }

}
