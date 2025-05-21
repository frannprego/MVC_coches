package controller;

import model.Coche;

import java.util.ArrayList;
import java.util.List;

public class CocheController {
    private final List<Coche> coches = new ArrayList<>();

    public void crearCoche(String marca, String modelo) {
        coches.add(new Coche(marca, modelo));
    }

    public List<Coche> getCoches() {
        return coches;
    }
}
