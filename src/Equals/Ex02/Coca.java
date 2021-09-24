package Equals.Ex02;

public class Coca {
    private Integer tamanho;
    private double preco;

    public Coca(Integer tamanho, double preco) {
        this.tamanho = tamanho;
        this.preco = preco;
    }

    @Override
    public boolean equals(Object objeto) {
        if (this == objeto) {
            return true;
        } else if (objeto instanceof Coca coca) {
            return coca.tamanho.equals(this.tamanho);
        } else {
            return false;
        }
    }
}
