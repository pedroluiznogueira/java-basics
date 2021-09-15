public class Pet implements EmissorDeSom, Movimentador {

    private double peso;
    private double altura;

    // Métodos de acesso
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String emitirSom() {
        return "Estou emitindo som de Pet";
    }

    @Override
    public String movimentar() {
        return "Caminhando com minhas patinhas";
    }
}
