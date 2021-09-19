public class Carro implements EmissorDeSom, Movimentador {

    public String emitirSom() {
        return "Eu estou emitindo som de Carro";
    }

    public String movimentar() {
        return "Estou andando com minhas rodas";
    }
}
