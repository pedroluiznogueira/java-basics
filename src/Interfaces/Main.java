package Interfaces;

public class Main {

    public static void main(String[] args) {

        Contrato c1 =  new Contrato();
        c1.setNome("Contrato 1");
        c1.setTipo("docx");

        Foto f1 = new Foto();
        f1.setNome("Festa");
        f1.setTipo("png");

        Documento d1 = new Documento();
        d1.setNome("Teste");
        d1.setTipo("doc");

        Impressora.adicionarImprimivel(c1);
        Impressora.adicionarImprimivel(f1);
        Impressora.adicionarImprimivel(d1);


        Impressora.imprimirTudo();



    }




}

