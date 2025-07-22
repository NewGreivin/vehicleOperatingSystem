/**
 * @author Greivin
 */
package Subsistemas.kilometraje;

public class Odometro {
    private double kmRecorridos;

    public double getkmRecorridos() {
        return kmRecorridos;
    }

    public void setkmRecorridos(double kmRecorridos) {
        if (kmRecorridos > 0) {
        this.kmRecorridos = kmRecorridos;
        }
    }

    public Odometro() {
        this.kmRecorridos = 0;
    }
    
}
