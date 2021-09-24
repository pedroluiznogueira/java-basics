package Equals.Ex03;

public class Aluno {
    private String nome;
    private Integer numeroDeAluno;

    public Aluno(String nome, Integer numeroDeAluno) {
        this.nome = nome;
        this.numeroDeAluno = numeroDeAluno;
    }

    @Override
    public String toString() {
        return this.nome + " " + this. numeroDeAluno;
    }

    @Override
    public boolean equals(Object objeto) {
        if (super.equals(objeto)) return true;
        else if (objeto instanceof Aluno aluno) return aluno.numeroDeAluno.equals(this.numeroDeAluno);
        else return false;
    }
}
