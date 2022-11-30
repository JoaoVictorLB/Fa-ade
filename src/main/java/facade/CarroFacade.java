package main.java.facade;

public class CarroFacade {
    public static boolean verificarSistemasDoVeiculo(Carro carro){
        if (Bateria.getInstancia().verificarCarroInoperante(carro)) {
            return false;
        }
        if (Oleo.getInstancia().verificarCarroInoperante(carro)) {
            return false;
        }
        if (Tanque.getInstancia().verificarCarroInoperante(carro)) {
            return false;
        }
        return true;
    }
}
