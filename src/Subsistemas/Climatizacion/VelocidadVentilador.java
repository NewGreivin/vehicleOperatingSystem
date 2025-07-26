/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Subsistemas.Climatizacion;

/**
 *
 * @author UTN
 */
public enum VelocidadVentilador {
    //(OFF, LOW, MEDIUM, HIGH).
    OFF("OFF"),
    LOW("LOW"),
    MEDIUM("MEDIUM"),
    HIGH("HIGH");
    
    private String velocidadVentilador;

    public String getVelocidadVentilador() {
        return velocidadVentilador;
    }

    private VelocidadVentilador(String velocidadVentilador) {
        this.velocidadVentilador = velocidadVentilador;
    }

    @Override
    public String toString() {
        return "VelocidadVentilador{" + "velocidadVentilador=" + velocidadVentilador + '}';
    }
    
    
}
