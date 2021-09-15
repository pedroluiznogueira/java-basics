package Interfaces;

public class Contrato implements Imprimivel {
    private String nome;
    private String tipo;

    @Override
    public void imprimir() {
        System.out.println("Nome: "+nome);
        System.out.println("Tipo: "+tipo);
        System.out.println("Sou um contrato muito legal");
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

