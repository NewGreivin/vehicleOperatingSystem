/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Subsistemas.Luces;

/**
 *
 * @author Marisol
 */
public class LucesInterior extends Luces{
    public void ajustarNivel(int nivel){
        if(estanEncendidas()){
            System.out.println("Ajustando nivel de luz interior a nivel: " + nivel);
        }else{
            System.out.println("No se puede ajustar el nivel, luces estan apagadas");
        }
    }
}
