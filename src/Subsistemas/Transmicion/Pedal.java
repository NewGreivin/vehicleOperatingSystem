/**
 * @author Greivin
 */
package Subsistemas.Transmicion;

public abstract class Pedal {
    protected boolean presionado;

    public void presionar() {
        presionado = true;
    }

    public void soltar() {
        presionado = false;
    }

    public boolean estaPresionado() {
        return presionado;
    }
}
