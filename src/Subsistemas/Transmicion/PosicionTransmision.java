/**
 * @author Greivin
 */
package Subsistemas.Transmicion;

public enum PosicionTransmision {
    PARKING("P"),
    REVERSE("R"),
    NEUTRO("N"),
    DRIVE("D");
    
    private String posicionMarcha;

    public String getPosicionMarcha() {
        return posicionMarcha;
    }

    private PosicionTransmision(String posicionMarcha) {
        this.posicionMarcha = posicionMarcha;
    }
    
}
