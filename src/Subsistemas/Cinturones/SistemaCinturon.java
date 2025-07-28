/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Subsistemas.Cinturones;

import Interfaces.Activable;
import Subsistemas.Encendido.EstadoEncendido;
import Subsistemas.Encendido.SistemaEncendido;
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 *
 * @author UTN
 */
public class SistemaCinturon extends Cinturon implements Activable {

    private SistemaEncendido sistemaEncendido;

    public SistemaCinturon(boolean cinturon, TipoCinturon tipo, SistemaEncendido sistemaEncendido) {
        super(cinturon, tipo);
        this.sistemaEncendido = sistemaEncendido;
    }

    @Override
    public void encender() {
        this.encenderCinturon();
    }

    @Override
    public void apagar() {
        this.apagarCinturon();
    }
    
    public void verificarCinturones(SistemaCinturon[ ] cinturones) {
        if (sistemaEncendido.getEstado() != EstadoEncendido.ENCENDIDO) {
            return;
        }
    
        boolean alerta = false;

        for (SistemaCinturon c : cinturones) {
            if (!c.isCinturon()) {
                System.out.println(c.getTipo() + " no tiene el cinturón colocado.");
                reproducirAlerta();
                return;
            }
        }
    }

    private static void reproducirAlerta(){
        try{
            File sonido = new File("src/Recuersos/Sonidos/alertaCinturo.wav");
            AudioInputStream audiolnputStream = AudioSystem.getAudioInputStream(sonido);
            Clip clip = AudioSystem.getClip();
            clip.open(audiolnputStream);
            clip.start();
        }catch (Exception e){
            System.out.println("Error al reproducir sonido" + e.getMessage());
        }
    }
}
