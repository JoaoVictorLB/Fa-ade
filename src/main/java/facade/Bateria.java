package main.java.facade;

public class Bateria extends Componentes {
    private static Bateria bateria = new Bateria();

    private Bateria() {};

    public static Bateria getInstancia() {
        return bateria;
    }
}
