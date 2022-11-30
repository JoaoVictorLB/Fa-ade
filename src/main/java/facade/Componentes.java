package main.java.facade;

import java.util.ArrayList;
import java.util.List;

public abstract class Componentes {
    private List<Carro> carrosInoperantes = new ArrayList<Carro>();

    public void addCarroInoperante(Carro carro) {
        this.carrosInoperantes.add(carro);
    }

    public boolean verificarCarroInoperante(Carro carro) {
        return this.carrosInoperantes.contains(carro);
    }
}
