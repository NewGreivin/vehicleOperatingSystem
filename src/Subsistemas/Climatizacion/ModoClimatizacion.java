/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Subsistemas.Climatizacion;

/**
 *
 * @author UTN
 */
public enum ModoClimatizacion {
    //(A/C, calefacción, ventilación).
    AC("A/C"),
    CALEFACCION("CALEFACCION"),
    VENTILACION("VENTILACION");
    
    private String climatizacion;

    public String getClimatizacion() {
        return climatizacion;
    }

    private ModoClimatizacion(String climatizacion) {
        this.climatizacion = climatizacion;
    }

    @Override
    public String toString() {
        return "ModoClimatizacion{" + "climatizacion=" + climatizacion + '}';
    }
    
    
}
