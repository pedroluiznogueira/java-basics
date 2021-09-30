package Exceptions.Impressora;

public class Memorando extends DocumentoGenerico implements Imprimivel {
    private String numero;

    @Override
    public void imprimir() {
        System.out.println(this.numero);
    }
}