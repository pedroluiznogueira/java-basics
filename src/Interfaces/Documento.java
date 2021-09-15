package Interfaces;

public class Documento implements Imprimivel{
    public String nome;
    public String tipo;

    @Override
    public void imprimir() {
        System.out.println("Nome = "+nome);
        System.out.println("Tipo = "+tipo);
        System.out.println("Sou um Documento muito legal");
        System.out.println("");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
