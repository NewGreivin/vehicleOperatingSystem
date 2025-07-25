/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Subsistemas.Luces;

/**
 *
 * @author Marisol
 */
public enum DireccionEnum {
    IZQUIERDA("Izquierda"),
    DERECHA("Derecha");
    
    private final String nombre;

    private DireccionEnum(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}

