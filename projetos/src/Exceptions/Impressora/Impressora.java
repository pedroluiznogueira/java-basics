package Exceptions.Impressora;

import java.util.Arrays;

public class Impressora {
    // Relaciona à não podermos instanciar objetos da impressora e da interface imprimiveis
    private DocumentoGenerico[] documentos = new DocumentoGenerico[10];

    public void adicionarDocumento(DocumentoGenerico imprimivel) {
        for (int i = 0; i < documentos.length; i++) {
            if (documentos[i] == null) {
                documentos[i] = imprimivel;
                // Evita percorrer o array sem necessidade
                break;
            }
        }
    }

    public void imprimirTodos() {
//        for (int i = 0; i < documentos.length; i++) {
//            if (documentos[i] == null) {
//                break;
//            } else {
//                // Aqui está sendo delegado, só vai ser sinalizado o comportamento de se imprima, portante aparece a necessidade da interface
//                documentos[i].imprimir();
//            }
//
//        }

        // envolvendo o que vai tentar ser executado
        try {
            Arrays.
                    asList(documentos)
                    .stream()
                    .forEach(DocumentoGenerico::imprimir);
        }
        // como eu vi que foi um NullPointerException que foi disparado
        catch (NullPointerException e) {
            System.out.println("Elemento nulo");
        }
    }
}