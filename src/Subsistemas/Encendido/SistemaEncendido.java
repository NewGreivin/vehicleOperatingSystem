/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Subsistemas.Encendido;
import Interfaces.Activable;
/**
 *
 * @author Genesis
 */
public class SistemaEncendido implements Activable {
    private EstadoEncendido estado;

    public SistemaEncendido() {
        this.estado = EstadoEncendido.APAGADO;
    }

    @Override
    public void encender() {
        estado = EstadoEncendido.ENCENDIDO;
        System.out.println("Vehículo encendido.");
    }

    @Override
    public void apagar() {
        estado = EstadoEncendido.APAGADO;
        System.out.println("Vehículo apagado.");
    }

    public String estadoActual() {
        return estado.name();
    }
}

