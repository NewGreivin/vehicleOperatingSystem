/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Subsistemas.Luces;

/**
 *
 * @author Marisol
 */
public class Luces {
    private boolean encendidas;
    
    public Luces(){
        this.encendidas = false;
    }
    
    public void encender(){
        encendidas = true;
        System.out.println("Luces encendidas");
    }
    
    public void apagar(){
        encendidas = false;
        System.out.println("Luces apagadas");
    }
    
    public boolean estanEncendidas(){
        return encendidas;
    }
        
}
