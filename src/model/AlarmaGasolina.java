package model;
/**
 * Observador que lanza una alerta si la gasolina baja de 10 litros.
 */

public class AlarmaGasolina implements ObservadorAlarma {
    public void notificar(double gasolina) {
        if (gasolina < 10) {
            System.out.println(" Alerta: Repostar");
        }
    }
}