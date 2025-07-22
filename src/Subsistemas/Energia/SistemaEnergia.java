/**
 * @author Greivin
 */
package Subsistemas.Energia;

import Subsistemas.Subsistema;

public class SistemaEnergia implements Subsistema {
    private EnergiaNivel nivel;
    private int energiaActual;  // De 0 a 100

    public EnergiaNivel getNivel() {
        return nivel;
    }
    public int getEnergiaActual() {
        return energiaActual;
    }

    public void setNivel(EnergiaNivel nivel) {
        this.nivel = nivel;
    }

    public SistemaEnergia() {
        this.nivel = EnergiaNivel.LLENO;
        actualizarNivel();
    }

    public void consumirEnergia(int cantidad) {
        if (cantidad <= 0) return; //Salir
        energiaActual -= cantidad;
        if (energiaActual < 0) {
            energiaActual = 0;}
        actualizarNivel();
    }
    
    public void recargarEnergia(int cantidad) {
        if (cantidad <= 0) return;
        energiaActual += cantidad; //Suma cantidad nueva a la que habia
        if (energiaActual > 100) {
            energiaActual = 100;}
        actualizarNivel();
    }

    private void actualizarNivel() {
        if (energiaActual >= 100) {
            nivel = EnergiaNivel.LLENO;
        } else if (energiaActual > 70) {
            nivel = EnergiaNivel.ALTO;
        } else if (energiaActual > 40) {
            nivel = EnergiaNivel.MEDIO;
        } else if (energiaActual > 10) {
            nivel = EnergiaNivel.BAJO;
        } else {
            nivel = EnergiaNivel.VACIO;
        }
    }
    
    @Override
    public String estadoActual() {
    return "Energía: " + energiaActual + "% (" + nivel + ")";
    }
    @Override
    public void encender(Object t) { 
    }
    @Override
    public void apagar(Object t) { 
    }
       
}