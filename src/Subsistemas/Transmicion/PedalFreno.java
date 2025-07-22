/**
 * @author Greivin
 */
package Subsistemas.Transmicion;

public class PedalFreno extends Pedal {
    private double intensidadFreno;

    public double getIntensidadFreno() {
        return intensidadFreno;
    }
    
    @Override
    public void soltar() {
        this.intensidadFreno = 0.0;
        super.soltar(); 
    }

    public PedalFreno(double presion) {
        this.intensidadFreno = presion;
        super.presionar();
    }

}