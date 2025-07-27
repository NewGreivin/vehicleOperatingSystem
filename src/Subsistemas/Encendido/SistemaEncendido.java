/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Subsistemas.Encendido;
import Core.Vehiculos.Motor;
import Subsistemas.Energia.EnergiaNivel;
import Subsistemas.Energia.SistemaEnergia;

/**
 *
 * @author Genesis
 */
public class SistemaEncendido {
    private EstadoEncendido estado;
    private Motor motor;
    private SistemaEnergia sistemaEnergia;
    
        public EstadoEncendido getEstado() {
        return estado;
    }

    public SistemaEncendido(Motor motor, SistemaEnergia sistemaEnergia) {
    this.motor = motor;
    this.sistemaEnergia = sistemaEnergia;
    this.estado = EstadoEncendido.APAGADO;
    }

    public void alternarEncendido() {
       if (estado == EstadoEncendido.APAGADO) {
        if (sistemaEnergia.getNivel() != EnergiaNivel.VACIO) {
            motor.encender();
            estado = EstadoEncendido.ENCENDIDO;
        } else {
            System.out.println("¡No hay energía suficiente para encender el vehículo!");
        }
        } else {
        motor.apagar();
        estado = EstadoEncendido.APAGADO;
        System.out.println("Vehículo apagado.");
    }
    }

}