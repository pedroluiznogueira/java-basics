public abstract class Impressora {
    // Relaciona à não podermos instanciar objetos da impressora e da interface imprimiveis
    private static Imprimivel[] documentos = new Imprimivel[10];

    public static void adicionarDocumento(Imprimivel imprimivel) {
        for (int i = 0; i < documentos.length; i++) {
            if (documentos[i] == null) {
                documentos[i] = imprimivel;
                // Evita percorrer o array sem necessidade
                break;
            }
        }
    }

    public static void imprimirTodos() {
        for (int i = 0; i < documentos.length; i++) {
            if (documentos[i] == null) {
                break;
            } else {
                documentos[i].imprimir();
            }

        }
    }

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

        Impressora.adicionarDocumento(contrato);
        Impressora.adicionarDocumento(documento);
        Impressora.adicionarDocumento(foto);

        Impressora.imprimirTodos();
    }

}
