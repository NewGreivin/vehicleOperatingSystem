/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Subsistemas.Cinturones;

import Interfaces.Activable;

/**
 *
 * @author UTN
 */
public class SistemaCinturon extends Cinturon implements Activable {

    public SistemaCinturon(boolean cinturon) {
        super(cinturon);
    }

    @Override
    public void encender() {
        this.encenderCinturon();
    }

    @Override
    public void apagar() {
        this.apagarCinturon();
    }
}
