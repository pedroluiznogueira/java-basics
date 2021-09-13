package IntroPOO;

public class Impressora {
    public String tipoDoc;

    public Impressora() {}

    public void imprimirDoc() {
        System.out.println("Foi impresso o documento do tipo: " + this.tipoDoc);
    }

    public void imprimirFila() {
        System.out.println("A fila foi impressa");
    }
}
