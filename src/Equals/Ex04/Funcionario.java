package Equals.Ex04;

public class Funcionario {
    private String nome;
    private Integer numeroDeRegistro;

    public Funcionario(String nome, Integer numeroDeRegistro) {
        this.nome = nome;
        this.numeroDeRegistro = numeroDeRegistro;
    }

    @Override
    public boolean equals(Object objeto) {
        if (super.equals(objeto)) return true;
        else if (objeto instanceof Funcionario funcionario) return funcionario.numeroDeRegistro.equals(this.numeroDeRegistro);
        return false;
    }
}
