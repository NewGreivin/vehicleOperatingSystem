/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Subsistemas.Cinturones;

/**
 *
 * @author Ricardo Chaves
 */
public enum TipoCinturon {
    CONDUCTOR("Conductor"),
    PASAJERO("Pasajero");
    
    private String tipo;

    public String getTipo() {
        return tipo;
    }

    private TipoCinturon(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "TipoCinturon{" + "tipo=" + tipo + '}';
    }

}
