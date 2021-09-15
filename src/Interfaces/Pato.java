package Interfaces;

public class Pato implements Voador {
    private int energia;

    @Override
    public void voar() {
        System.out.println("Estou voando como um pato");
    }
}
