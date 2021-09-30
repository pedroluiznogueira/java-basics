package Exceptions.Impressora;

public class Foto extends DocumentoGenerico implements Imprimivel {
    @Override
    public void imprimir() {
        System.out.println("Nome: " + this.getNome() + ", Tipo: " + this.getTipo() + ", sou uma selfie");
    }
}
