package Exceptions.Impressora;

public class Main {

    public static void main(String[] args) {
        Contrato contrato = new Contrato();
        contrato.setNome("Contrato 1");
        contrato.setTipo("Tipo x");

        Documento documento = new Documento();
        documento.setNome("Documento 1");
        documento.setTipo("Tipo x");

        Foto foto = new Foto();
        foto.setNome("Foto 1");
        foto.setTipo("Tipo x");

        Impressora impressora = new Impressora();

        impressora.adicionarDocumento(contrato);
        impressora.adicionarDocumento(documento);
        impressora.adicionarDocumento(foto);

        System.out.println("== Imprimindo elementos ==");
        impressora.imprimirTodos();
    }
}