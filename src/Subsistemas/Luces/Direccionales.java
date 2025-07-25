/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Subsistemas.Luces;

/**
 *
 * @author Marisol
 */
public class Direccionales extends Luces{
    public void encencerDireccional(DireccionEnum direccion){
        encender();
        System.out.println("Direccional " + direccion.getNombre() + " encendida");
    }
    
    public void apagarDireccional(){
        apagar();
        System.out.println("Direccionales apagadas");
    }
}
