/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Subsistemas.Luces;

/**
 *
 * @author Marisol
 */
public class LucesDelanteras extends Luces {
    private boolean lucesAltas;

    public boolean isLucesAltas() {
        return lucesAltas;
    }

    public void encenderLucesAltas() {
        lucesAltas = true;
        encender();
    }

    public void encenderLucesBajas() {
        lucesAltas = false;
        encender();
    }

    public void apagarLuces() {
        apagar();
    }
}
