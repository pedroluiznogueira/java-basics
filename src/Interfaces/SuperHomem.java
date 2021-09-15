package Interfaces;

public class SuperHomem implements Voador {
    private int experiencia;

    @Override
    public void voar() {
        System.out.println("Estou voando como um campeão");
    }
}
