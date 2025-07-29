/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Subsistemas.Luces;
/**
 *
 * @author Marisol
 */
public class LucesEmergencia extends Luces {
    private Direccionales direccionalIzquierda;
    private Direccionales direccionalDerecha;

    public boolean estanActivadasAmbas() {
        return direccionalIzquierda.isEncendidas() && direccionalDerecha.isEncendidas();
    }
    
    public LucesEmergencia() {
        this.direccionalIzquierda = new Direccionales();
        this.direccionalDerecha = new Direccionales();
    }

    public void activarEmergencia() {
        encender(); 
        direccionalIzquierda.encenderDireccional(DireccionEnum.IZQUIERDA);
        direccionalDerecha.encenderDireccional(DireccionEnum.DERECHA);
    }

    public void desactivarEmergencia() {
        apagar();
        direccionalIzquierda.apagarDireccional();
        direccionalDerecha.apagarDireccional();
    }
}
