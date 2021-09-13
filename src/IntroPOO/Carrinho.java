package IntroPOO;

public class Carrinho extends Cardapio {
    public int qtdItens;
    public int total;

    public Carrinho() {
        super();
    }

    public void adicionarItem(String item) {
        this.qtdItens =+ 1;
    }

    public void adicionarCombo(String combo) {
        this.qtdItens =+ 2;
    }

    public int valorCompra() {
        this.total = qtdItens * 10;
        return this.total;
    }
}
