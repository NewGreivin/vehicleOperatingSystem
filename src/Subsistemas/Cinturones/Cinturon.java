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
    private boolean cinturon;

    public boolean isCinturon() {
        return cinturon;
    }

    public Cinturon(boolean cinturon) {
        this.cinturon = cinturon;
    }

    @Override
    public String toString() {
        return "Cinturon{" + "cinturon=" + cinturon + '}';
    }
    
    public void encenderCinturon(){
        this.cinturon=true;
    }
    
    public void apagarCinturon(){
        this.cinturon=false;
    }
}
