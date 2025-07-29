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
    private LucesDelanteras delanteras;
    private Direccionales direccionales;
     private LucesEmergencia emergencia;
    
    public SistemaLuces(){
        this.interior = new LucesInterior();
        this.delanteras = new LucesDelanteras();
        this.direccionales = new Direccionales();
        this.emergencia = new LucesEmergencia();
    }
    
    public void puertaAbierta() {
        interior.encenderPorPuerta();
    }
    public void puertaCerrada() {
        interior.apagarPorPuerta();
    }
    
    public void encenderLucesAltas() {
        delanteras.encenderLucesAltas();
    }
    public void encenderLucesBajas() {
        delanteras.encenderLucesBajas();
    }
    public void apagarLucesDelanteras() {
        delanteras.apagarLuces();
    }
    
    public void encenderDireccionalIzq(){ 
        direccionales.encenderDireccional(DireccionEnum.IZQUIERDA);
    }
    public void encenderDireccionalDer(){ 
        direccionales.encenderDireccional(DireccionEnum.DERECHA);
    }
    public void apagarDireccional(){
        direccionales.apagarDireccional();
    }
    
    public void activarLuEmergencia() {
        emergencia.activarEmergencia();
    }
    public void apagarLuzEmergencia() {
        emergencia.desactivarEmergencia();
    }
}