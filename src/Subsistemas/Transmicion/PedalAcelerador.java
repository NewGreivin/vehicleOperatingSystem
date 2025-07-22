/**
 * @author Greivin
 */
package Subsistemas.Transmicion;

public class PedalAcelerador extends Pedal {
    private double presion;

    public double getPresion() {
        return presion;
    }
    
    @Override
    public void soltar() {
        this.presion = 0.0;
        super.soltar(); 
    }

    public PedalAcelerador(double presion) {
        this.presion = presion;
        super.presionar();
    }
    
}