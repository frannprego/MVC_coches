import java.lang.module.ModuleDescriptor;

public class Controller {
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

}