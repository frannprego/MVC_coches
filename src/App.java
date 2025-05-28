/**
 * Classe punto de entrada de la aplicación
 */
public class App {
    /**
     * metodo principal
     * Lanza la interfaz gráfica
     * @param args argumentos de la aplicacion
     */
    public static void main(String[] args) {
        // genera un coche para pruebas
        Controller.crearCoche("Fiat 500", "ABC1234");
        // muestra el menu
        View.menu();
    }

}
