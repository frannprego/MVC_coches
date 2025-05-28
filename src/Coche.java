public class Coche {
    String matricula;
    String modelo;
    Integer velocidad;

    public Coche(String modelo, String matricula) {
        this.modelo = modelo;
        this.matricula = matricula;
        this.velocidad = 0;
    }

    public String getGasolina() {
        return "";
    }

    public void ponerGasolina(double litros) {
        getGasolina();
    }
}
