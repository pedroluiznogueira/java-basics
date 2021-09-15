package Interfaces;

public abstract class Impressora {
    public static Imprimivel[] lista = new Imprimivel[3];
    private static int posLivre = -1;

    public static void imprimirTudo() {
        for(int i = 0; i<=posLivre; i++){
            lista[i].imprimir();
            System.out.println("");
        }
    }
    public static void adicionarImprimivel(Imprimivel umImprimivel) {
        posLivre++;
        lista[posLivre] = umImprimivel;
    }

}
