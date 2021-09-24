package Impressora;

public class Main {

    public static void main(String[] args) {
        Contrato contrato = new Contrato();
        contrato.setNome("Contrato 1");
        contrato.setTipo("Tipo x");

        Documento documento = new Documento();
        contrato.setNome("Documento 1");
        contrato.setTipo("Tipo x");

        Foto foto = new Foto();
        contrato.setNome("Foto 1");
        contrato.setTipo("Tipo x");

        Impressora impressora = new Impressora();

        impressora.adicionarDocumento(contrato);
        impressora.adicionarDocumento(documento);
        impressora.adicionarDocumento(foto);

        impressora.imprimirTodos();
    }
}
