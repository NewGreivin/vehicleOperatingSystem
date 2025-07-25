/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Subsistemas.Limpiaparabrisas;

/**
 *
 * @author Marisol
 */
public enum ParabrisasVelocidad {
    APAGADA("Apagada"),
    BAJA("Baja"),
    MEDIA("Media"),
    ALTA("Alta");
    
    private final String descripcion;
    
    ParabrisasVelocidad(String descripcion){
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
