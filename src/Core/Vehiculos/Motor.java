/**
 * @author Greivin
 */
package Core.Vehiculos;

/**
 * Clase que simula el motor del vehiculo
 * Representa lo esencial para el funcionamiento
 * controla el encendido, revoluciones y potencia del motor
 */

public class Motor {
    private boolean encendido;
    private int revoluciones;  // en RPM
    private int potencia;         // en caballos de fuerza (HP)

    public boolean isEncendido() {
        return encendido;
    }
    public int getRevoluciones() {
        return revoluciones;
    }
    public int getPotencia() {
        return potencia;
    }

    public void setRevoluciones(int revoluciones) {
        this.revoluciones = revoluciones;
    }

    public Motor(int potencia) {
        this.encendido = false;
        this.revoluciones = 0;
        this.potencia = potencia;
    }
    
    public void encender(){
        this.encendido = true;
    }
            
    public void apagar() {
        this.encendido = false;
        revoluciones = 0;
    }
}
