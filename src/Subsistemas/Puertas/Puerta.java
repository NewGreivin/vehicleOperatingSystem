/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Subsistemas.Puertas;

/**
 * @author Ricardo Chaves
 */
public class Puerta {
    private boolean puerta; //True: Abierta & False: Cerrada
    private boolean bloqueada; // True: con seguro
    
    public boolean isPuerta() {
        return puerta;
    }
    public boolean isBloqueada() {
        return bloqueada;
    }

    public Puerta(boolean puerta) {
        this.puerta = puerta;
        this.bloqueada = false;
    }

    @Override
    public String toString() {
        return"Puerta{" + "puerta=" + puerta + ", bloqueada=" + bloqueada;
    }
    
    //metodos
    
    public void abrirPuerta() {
        if (!bloqueada) {
            this.puerta = true;
        } else {
            System.out.println("Puerta bloqueada. No se puede abrir.");
        }
    }
    public void cerrarPuerta() {
        this.puerta = false;
    }
    
    public void bloquear() {
        this.bloqueada = true;
    }
    public void desbloquear() {
        this.bloqueada = false;
    }
}
