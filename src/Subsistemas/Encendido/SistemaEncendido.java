/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Subsistemas.Encendido;
/**
 *
 * @author Genesis
 */


public class SistemaEncendido implements Subsitema {
    private EstadoEncendido estado;

    public SistemaEncendido() {
        this.estado = EstadoEncendido.APAGADO;
    }

    @Override
    public void encender() {
        estado = EstadoEncendido.ENCENDIDO;
        System.out.println("El vehículo ha sido encendido.");
    }

    @Override
    public void apagar() {
        estado = EstadoEncendido.APAGADO;
        System.out.println("El vehículo ha sido apagado.");
    }

    @Override
    public String estadoActual() {
        return estado.name();
    }

    public boolean estaEncendido() {
        return estado == EstadoEncendido.ENCENDIDO;
    }
}
