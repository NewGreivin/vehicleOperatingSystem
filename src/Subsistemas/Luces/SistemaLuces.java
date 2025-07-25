/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Subsistemas.Luces;

/**
 *
 * @author Marisol
 */
public class SistemaLuces {
    private LucesInterior interior;
    private Direccionales direccionales;
    
    public SistemaLuces(){
        this.interior = new LucesInterior();
        this.direccionales = new Direccionales();
    }
    
    public void encenderLucesInterior(){ //interior
        interior.encender();
    }
    
    public void apagarLucesInterior(){
        interior.apagar();   
    }
    
    public void ajustarNivel(int nivel){
        interior.ajustarNivel(nivel);
    }
    
    
    public void encenderDireccionalIzq(){ //Direccionales
        direccionales.encencerDireccional(DireccionEnum.IZQUIERDA);
    }
    
    public void encenderDireccionalDer(){ 
        direccionales.encencerDireccional(DireccionEnum.DERECHA);
    }
    
    public void apagarDireccional(){
        direccionales.apagarDireccional();
    }
}
