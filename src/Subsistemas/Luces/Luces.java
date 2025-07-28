/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Subsistemas.Luces;

import Interfaces.Activable;

/**
 *
 * @author Marisol
 */
public abstract class Luces implements Activable{  
    protected boolean encendidas;
    
    public boolean isEncendidas(){
        return encendidas;
    }
    
    public Luces(){
        this.encendidas = false;
    }
    
    @Override
    public void encender() {
       encendidas = true;
    }

    @Override
    public void apagar() {
      encendidas = false;
    }

}