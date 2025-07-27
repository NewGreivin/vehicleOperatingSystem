/**
 * @author Greivin
 */
package Subsistemas.Transmicion;

import Core.Vehiculos.Motor;

public abstract class Pedal {
    protected Motor motor;

    public Pedal(Motor motor) {
        this.motor = motor;
    }

    public abstract void presionar(); //Instanciar metodos, mas no programarlos (Metodos abstractos)
    public abstract void soltar();
}
