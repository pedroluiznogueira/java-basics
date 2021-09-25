package CollectionsAvancado.Ex04;

public class Peca {
    private String marca;
    private String modelo;

    public Peca(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void retirar() {

    }

    @Override
    public String toString() {
        return "Peca{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
