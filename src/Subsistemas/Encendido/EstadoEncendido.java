/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Subsistemas.Encendido;

/**
 *
 * @author Genesis
 */
public enum EstadoEncendido {
    ENCENDIDO,
    APAGADO;
    
    private boolean encendido;

    public boolean isEncendido() {
        return encendido;
    }
}