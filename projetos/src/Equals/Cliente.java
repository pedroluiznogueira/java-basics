package Equals;

public class Cliente {

    private String nome;
    private String sobrenome;
    private double altura;

    // ao falar de criação de objeto falamos de construtor

    public String getNome() {

        return this.nome;
    }

    public void setNome(String nome) {

        if (nome == null) {
            System.out.println("Nome inválido");
        } else {
            this.nome = nome;
        }
    }

    public String getSobrenome() {

        return this.sobrenome;
    }

    public void setSobrenome(String sobrenome) {

        this.sobrenome = sobrenome;
    }

    @Override
    public String toString() {
        return this.nome + " " + this.sobrenome + " " + this.altura;
    }
}
