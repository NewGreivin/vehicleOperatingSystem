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
    private DireccionEnum direccionalActiva;
    
    public DireccionEnum getDireccionalActiva() {
        return direccionalActiva;
    }
    
    public void encencerDireccional(DireccionEnum direccion){
        this.direccionalActiva = direccion;
        encender();
    }
    
    public void apagarDireccional(){
        direccionalActiva = null;
        apagar();
    }
}
