/**
 * @author Greivin
 */
package Subsistemas.kilometraje;

public class Velocimetro {
    private double velocidadActual;

    public double getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(double velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    public Velocimetro() {
        this.velocidadActual = 0;
    }

}
