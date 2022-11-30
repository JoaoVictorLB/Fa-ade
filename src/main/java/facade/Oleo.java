package main.java.facade;

public class Oleo extends Componentes {
    private static Oleo oleo = new Oleo();

    private Oleo() {};

    public static Oleo getInstancia() {
        return oleo;
    }
}
