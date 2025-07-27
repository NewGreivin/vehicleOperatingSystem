/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Subsistemas.Encendido;
import Core.Vehiculos.Motor;
/**
 *
 * @author Genesis
 */
public class SistemaEncendido {

    private EstadoEncendido estado;
    private final Motor motor;

    public SistemaEncendido(Motor motor) {
        this.motor = motor;
        this.estado = EstadoEncendido.APAGADO;
    }

    public void alternarEncendido() {
        if (estado == EstadoEncendido.APAGADO) {
            motor.encender();
            estado = EstadoEncendido.ENCENDIDO;
        } else {
            motor.apagar();
            estado = EstadoEncendido.APAGADO;
        }
    }

    public EstadoEncendido getEstado() {
        return estado;
    }
}