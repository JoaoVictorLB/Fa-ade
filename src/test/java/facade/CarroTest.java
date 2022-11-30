package test.java.facade;

import main.java.facade.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CarroTest {
    @Test
    void deveRetornarCarroComBateriaInapta() {
        Carro carro = new Carro();
        Bateria.getInstancia().addCarroInoperante(carro);

        assertEquals(false, carro.ligar());
    }

    @Test
    void deveRetornarCarroComOleoInapto() {
        Carro carro = new Carro();
        Oleo.getInstancia().addCarroInoperante(carro);

        assertEquals(false, carro.ligar());
    }

    @Test
    void deveRetornarCarroComTanqueInapto() {
        Carro carro = new Carro();
        Tanque.getInstancia().addCarroInoperante(carro);

        assertEquals(false, carro.ligar());
    }

    @Test
    void deveRetornarCarroApto() {
        Carro carro = new Carro();

        assertEquals(true, carro.ligar());
    }
}
