/**
 * @author Greivin
 */
package Subsistemas.kilometraje;

public class TacometroRPM {
    private int rpmActual;

    public int getRpmActual() {
        return rpmActual;
    }

    public void setRpmActual(int rpmActual) {
        this.rpmActual = rpmActual;
    }

    public TacometroRPM() {
        this.rpmActual = 0;
    }

}
