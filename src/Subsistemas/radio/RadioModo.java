/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Subsistemas.radio;

/**
 *
 * @author Marisol
 */
public enum RadioModo {
    AM("AM"),
    FM("FM"),
    AUX("AUX"),
    BLUETOOTH("Bluetooth"),
    USB("USB");
    
    private final String descripcion;
    
    RadioModo(String descripcion){
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
    
}
