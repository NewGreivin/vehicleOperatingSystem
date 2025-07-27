/**
 * @author Greivin
 */
package Subsistemas.kilometraje;

public class Odometro {
    private double kmRecorridos;

    public double getkmRecorridos() {
        return kmRecorridos;
    }

    public void setAddkmRecorridos(double addKm) {
        if (addKm > 0) {
        this.kmRecorridos += addKm;
        }
    }

    public Odometro() {
        this.kmRecorridos = 0;
    }
    
}
