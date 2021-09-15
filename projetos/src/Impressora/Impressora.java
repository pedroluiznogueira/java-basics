public class Impressora {
    // Relaciona à não podermos instanciar objetos da impressora e da interface imprimiveis
    private Imprimivel[] documentos = new Imprimivel[10];

    public void adicionarDocumento(Imprimivel imprimivel) {
        for (int i = 0; i < documentos.length; i++) {
            if (documentos[i] == null) {
                documentos[i] = imprimivel;
                // Evita percorrer o array sem necessidade
                break;
            }
        }
    }

    public void imprimirTodos() {
        for (int i = 0; i < documentos.length; i++) {
            if (documentos[i] == null) {
                break;
            } else {
                documentos[i].imprimir();
            }

        }
    }
}
