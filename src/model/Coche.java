package model;

import java.util.ArrayList;
import java.util.List;

public class Coche {
    private String marca;
    private String modelo;
    private int velocidad;
    private int gasolina;

    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = 0;
        this.gasolina= gasolina;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = Math.max(0, velocidad);
    }

    public int getVelocidad() {
        return velocidad;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    @Override
    public String toString() {
        return marca + " " + modelo + " - " + velocidad + " km/h";
    }
    private List<ObservadorAlarma> observadores = new ArrayList<>();
    /**
     * Añade un observador que será notificado si cambia el nivel de gasolina.
     */
    public void addObservador(ObservadorAlarma obs) {
        observadores.add(obs);
    }
    /**
     * Notifica a todos los observadores tras actualizar la gasolina.
     */
    private void notificarObservadores() {
        for (ObservadorAlarma obs : observadores) {
            obs.notificar(this.gasolina);
        }
    }

}
