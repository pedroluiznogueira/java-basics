public class Documento implements Imprimivel {

    private String tipo;
    private String nome;


    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void imprimir() {
        System.out.println("Nome: " + this.nome + ", Tipo: " + this.tipo + ", sou um documento");
    }
}
