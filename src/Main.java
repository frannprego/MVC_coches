import controller.CocheController;

public class Main {
    public static void main(String[] args) {
        CocheController controller = new CocheController();
        controller.crearCoche("Toyota", "Corolla");
        controller.aumentarVelocidad(0, 30);
    }
}
