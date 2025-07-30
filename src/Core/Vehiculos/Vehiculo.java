/**
 * @author Greivin
 */
package Core.Vehiculos;

import Subsistemas.Alarmas.SistemaAlarma;
import Subsistemas.Cinturones.SistemaCinturon;
import Subsistemas.Cinturones.TipoCinturon;
import Subsistemas.Climatizacion.SistemaClimatizacion;
import Subsistemas.Encendido.SistemaEncendido;
import Subsistemas.Energia.SistemaEnergia;
import Subsistemas.Limpiaparabrisas.SistemaParabrisas;
import Subsistemas.Luces.SistemaLuces;
import Subsistemas.Puertas.SistemaPuerta;
import Subsistemas.Sensores.SistemaSensores;
import Subsistemas.Transmicion.SistemaTransmicion;
import Subsistemas.kilometraje.SistemaKilometraje;
import Subsistemas.radio.SistemaRadio;

public class Vehiculo {
    private String marca;
    private String modelo;
    private int año;
    
    private Motor motor;
    private SistemaEncendido encendido;
    private SistemaLuces luces;
    private SistemaPuerta puertas;
    private SistemaCinturon cinturones;
    private SistemaAlarma alarma;
    private SistemaParabrisas limpiaparabrisas;
    private SistemaRadio radio;
    private SistemaClimatizacion climatizacion;
    private SistemaEnergia energia;
    private SistemaSensores sensores;
    private SistemaKilometraje kilometraje;
    private SistemaTransmicion transmision;
    private TipoCinturon tipoCinturon;

    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public int getAño() {
        return año;
    }

    public Motor getMotor() {
        return motor;
    }
    public SistemaEncendido getEncendido() {
        return encendido;
    }
    public SistemaLuces getLuces() {
        return luces;
    }
    public SistemaPuerta getPuertas() {
        return puertas;
    }
    public SistemaCinturon getCinturones() {
        return cinturones;
    }
    public SistemaAlarma getAlarma() {
        return alarma;
    }
    public SistemaParabrisas getLimpiaparabrisas() {
        return limpiaparabrisas;
    }
    public SistemaRadio getRadio() {
        return radio;
    }
    public SistemaClimatizacion getClimatizacion() {
        return climatizacion;
    }
    public SistemaEnergia getEnergia() {
        return energia;
    }
    public SistemaSensores getSensores() {
        return sensores;
    }
    public SistemaKilometraje getKilometraje() {
        return kilometraje;
    }
    public SistemaTransmicion getTransmision() {
        return transmision;
    }

    public Vehiculo(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        
        this.motor = new Motor();
        this.energia = new SistemaEnergia();
        this.transmision = new SistemaTransmicion(motor);
        this.encendido = new SistemaEncendido(motor, energia);
        this.alarma = new SistemaAlarma(false);
        this.luces = new SistemaLuces();
        this.puertas = new SistemaPuerta(false, alarma, luces);
        this.tipoCinturon = TipoCinturon.CONDUCTOR;
        this.cinturones = new SistemaCinturon(false, tipoCinturon, encendido);
        this.limpiaparabrisas = new SistemaParabrisas(encendido);
        this.radio = new SistemaRadio(encendido);
        this.climatizacion = new SistemaClimatizacion(encendido);
        this.sensores = new SistemaSensores(encendido, transmision);
        this.kilometraje = new SistemaKilometraje(transmision, motor);
    }
    
}