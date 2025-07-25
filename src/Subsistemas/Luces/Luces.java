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
public class Luces implements Activable{  
    
    @Override
    public void encender() {
       encendidas = true;
       System.out.println("Luces encendidas");
    }

    @Override
    public void apagar() {
      encendidas = false;
        System.out.println("Luces apagadas");
    }
    private boolean encendidas;
    
    public Luces(){
        this.encendidas = false;
    }
   
    public boolean estanEncendidas(){
        return encendidas;
    }
}