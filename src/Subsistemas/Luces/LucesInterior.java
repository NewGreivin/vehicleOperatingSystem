/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Subsistemas.Luces;

/**
 *
 * @author Marisol
 */
public class LucesInterior extends Luces{
    public void encenderPorPuerta() {
        if (!encendidas) {
            encender();
        }
    }
    
    public void apagarPorPuerta() {
        if (encendidas) {
            apagar();
        }
    }
}