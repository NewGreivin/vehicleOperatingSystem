/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Subsistemas.Puertas;

import Interfaces.Controlable;
import Interfaces.Informacion;
import Subsistemas.Alarmas.SistemaAlarma;

/**
 *
 * @author UTN
 */
    public class SistemaPuerta extends Puerta implements Controlable {

    private SistemaAlarma alarma;

    public SistemaPuerta(boolean puerta, SistemaAlarma alarma) {
        super(puerta);
        this.alarma = alarma;
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
    }

    @Override
    public void cerrar() {
        this.cerrarPuerta();
    }

    public void bloquear() {
        super.bloquear();
    }

    public void desbloquear() {
        super.desbloquear();
    }
}

