package main.java.facade;

public class Tanque extends Componentes {
    private static Tanque tanque = new Tanque();

    private Tanque() {};

    public static Tanque getInstancia() {
        return tanque;
    }
}
