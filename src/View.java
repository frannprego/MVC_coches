/**
 * Clase encargada de la interacción con el usuario
 */
public class View {
    /**
     * Menu inicial
     */
    public static void menu() {
        // menu de inicio
        // 1- crea un coche
        // 0- salir

        do {
            System.out.println("1- Crear coche");
            System.out.println("0- Salir");
            // TODO leer del teclado la opción
            int opcion = 1; // TODO leer del teclado
            switch (opcion) {
                case 1:
                    // creamos un coche
                    String modelo = "Fiat 500"; // TODO leer del teclado
                    String matricula = "ABC 1234"; // TODO leer del teclado
                    Coche nuevoCoche = Controller.crearCoche(modelo, matricula);
                    // mostramos al usuario el coche creado
                    System.out.println("Creado coche: " + nuevoCoche.modelo + " con matricula: " + nuevoCoche.matricula);
                    break;
                case 0:
                    // salimos del programa
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        } while (true);
    }

    /**
     * Muestra la velocidad de un coche
     * @param matricula del coche
     * @param v velocidad
     * @return true si se ha mostrado correctamente
     */
    public static boolean muestraVelocidad(String matricula, Integer v){
        System.out.println(matricula + ": " + v + "km/hr");
        return true;
    }

}
