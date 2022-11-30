package main.java.facade;

public class Carro {
    public boolean ligar() { return CarroFacade.verificarSistemasDoVeiculo(this); }
}
