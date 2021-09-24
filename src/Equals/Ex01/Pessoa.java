package Equals.Ex01;

public class Pessoa {
    private String nome;
    private Integer rg;

    public Pessoa(String nome, Integer rg) {
        this.nome = nome;
        this.rg = rg;
    }

    @Override
    public boolean equals(Object objeto) {
        if (super.equals(objeto)) {
            return true;
        // ambos são contas ? ambos não estão nulos ?
        } else if (objeto instanceof Pessoa pessoa){
            return this.rg.equals(pessoa.rg);
        // se chegar aqui significa que não são iguais
        } else {
            return false;
        }
    }
}
