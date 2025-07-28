/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Subsistemas.Puertas;

import Interfaces.Controlable;
import Interfaces.Informacion;
import Subsistemas.Alarmas.SistemaAlarma;
import Subsistemas.Luces.SistemaLuces;

/**
 *
 * @author UTN
 */
    public class SistemaPuerta extends Puerta implements Controlable {

    private SistemaAlarma alarma;
    private SistemaLuces sistemaLuces;

    public SistemaPuerta(boolean puerta, SistemaAlarma alarma, SistemaLuces luces) {
        super(puerta);
        this.alarma = alarma;
        this.sistemaLuces = luces;
    }
    
    @Override
    public void abrir() {
        if (this.isBloqueada()) {
            System.out.println("Puerta bloqueada. No se puede abrir.");
            return;
        }

        this.abrirPuerta();

        if (alarma != null && alarma.isActiva() && isPuerta()) {
            System.out.println("¡ALARMA SONANDO! Puerta abierta con alarma activada.");
        }

        sistemaLuces.puertaAbierta(); // Alerta a sistema de luces
    }
    
    @Override
    public void cerrar() {
        this.cerrarPuerta();
        sistemaLuces.puertaCerrada();
    }

    public void bloquear() {
        super.bloquear();
    }

    public void desbloquer() {
        super.desbloquear();
    }

}

