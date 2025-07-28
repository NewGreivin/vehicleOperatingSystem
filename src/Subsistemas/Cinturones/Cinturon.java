/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Subsistemas.Cinturones;

/**
 *
 * @author UTN
 */
public class Cinturon {
    private boolean cinturon; // true: abrochado
    private TipoCinturon tipo;

    public boolean isCinturon() {
        return cinturon;
    }
    public TipoCinturon getTipo() {
        return tipo;
    }

    public Cinturon(boolean cinturon, TipoCinturon tipo) {
        this.cinturon = cinturon;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Cinturon: " + "tipo: " + tipo + ", abrochado: " + cinturon;
    }
    
    public void encenderCinturon(){
        this.cinturon=true;
    }
    
    public void apagarCinturon() {
        this.cinturon = false;
    }
}
