public class Controller {
    Coche modelo;

    /**
     * Crea un coche
     * @param modelo del coche a crear
     * @param matricula del coche a crear
     * @return
     */
    public static Coche crearCoche(String modelo, String matricula) {
        // recojemos en aux el coche creado por el modelo
        Coche aux= Model.crearCoche(modelo, matricula);
        return aux;
    }
    public Controller(Coche modelo) {
        this.modelo = modelo;
    }

    public void avanzar(double metros) {
        double consumo = metros * (modelo.velocidad / 100);

    }

    public String ponerGasolina(double litros) {
        modelo.ponerGasolina(litros);
        return "Se añadieron " + litros + " litros. Gasolina actual: " + modelo.getGasolina() + " litros.";
    }
}
