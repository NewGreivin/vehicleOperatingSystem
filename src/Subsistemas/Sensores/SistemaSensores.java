/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Subsistemas.Sensores;
import Interfaces.Activable;
import Subsistemas.Encendido.SistemaEncendido;
import Subsistemas.Transmicion.PosicionTransmision;
import Subsistemas.Transmicion.SistemaTransmicion;
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;



/**
 *
 * @author Genesis
 */
public class SistemaSensores implements Activable {
    private boolean activos;
    private SensorFrenoMano frenoMano;
    private SensorReversa reversa;
    private SistemaEncendido sistemaEncendido;
    private SistemaTransmicion transmision;

    public SensorFrenoMano getFrenoMano() {
        return frenoMano;
    }
    public SensorReversa getReversa() {
        return reversa;
    } 
    
    public SistemaSensores(SistemaEncendido sistemaEncendido, SistemaTransmicion transmision) {
        this.activos = false;
        this.frenoMano = new SensorFrenoMano();
        this.reversa = new SensorReversa();
        this.sistemaEncendido = sistemaEncendido;
        this.transmision = transmision;
    }
@Override
    public void encender() {
        if (sistemaEncendido.getEstado().isEncendido()) {
            activos = true;
            frenoMano.ponerFreno();
        } else {
            System.out.println("No se puede activar sensores: vehículo apagado.");
        }
    }

    @Override
    public void apagar() {
        activos = false;
        reversa.desactivar();
    }

    public void verificar() {
        if (!activos || !sistemaEncendido.getEstado().isEncendido()) {
            return;
        }
// Activar sensor de reversa si está en reversa
        if (transmision.getPosicion() == PosicionTransmision.REVERSE) {
            reversa.activar();
        } else {
            reversa.desactivar();
        }
        
        // Alerta si hay obstáculo al retroceder
        if (reversa.isActivado() && reversa.isObstaculoDetectado()) {
            reproducirAlerta();
        }

        // Alerta si se intenta mover con el freno de mano puesto
        if (transmision.getVelocidad() > 0 && frenoMano.isActivado()) {
            reproducirAlerta();
        }
    }
private static void reproducirAlerta() {
        try {
            File sonido = new File("src/sonidos/alerta_sensor.wav");
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(sonido);
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch (Exception e) {
            System.out.println("Error al reproducir sonido: " + e.getMessage());
        }
    }

    public String estadoActual() {
        return activos ? "ACTIVOS" : "INACTIVOS";
    }
}
