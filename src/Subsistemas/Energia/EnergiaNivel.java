/**
 * @author Greivin
 */
package Subsistemas.Energia;

public enum EnergiaNivel {
    LLENO("Lleno"),
    ALTO("Alto"),
    MEDIO("Medio"),
    BAJO("Bajo"),
    VACIO("Vacio");
    
    private String energia;

    public String getEnergia() {
        return energia;
    }

    private EnergiaNivel(String energia) {
        this.energia = energia;
    }
    
}
