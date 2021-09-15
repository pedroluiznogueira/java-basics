package Interfaces;

public class Aviao implements Voador {
    private int horasVoo;

    @Override
    public void voar() {
        System.out.println("Estou voando como um avião");
    }
}
