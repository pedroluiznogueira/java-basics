public class Memorando implements Imprimivel {
    private String numero;

    @Override
    public void imprimir() {
        System.out.println(this.numero);
    }
}
