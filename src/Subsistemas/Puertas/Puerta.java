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

    public boolean isPuerta() {
        return puerta;
    }

    public Puerta(boolean puerta) {
        this.puerta = puerta;
    }

    @Override
    public String toString() {
        return "Puerta{" + "puerta=" + puerta + '}';
    }
    
    //metodos
    
    public void abrirPuerta() {
        this.puerta = true;
    }
    public void cerrarPuerta() {
        this.puerta = false;
    }

}
