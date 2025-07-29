/**
 * @author Greivin
 */
package Core.Simuladores;

import Core.Vehiculos.Vehiculo;

public class Simulador {
    private Vehiculo vehiculo;

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public Simulador() {
        this.vehiculo = new Vehiculo("Toyota", "Corolla", 1970);
    }
    
}