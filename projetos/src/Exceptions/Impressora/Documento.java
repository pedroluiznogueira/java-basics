package Exceptions.Impressora;

public class Documento extends DocumentoGenerico implements Imprimivel {

    @Override
    public void imprimir() {
        System.out.println("Nome: " + this.getNome() + ", Tipo: " + this.getTipo() + ", sou um documento");
    }
}
