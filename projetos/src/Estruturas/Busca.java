package Estruturas;

public class Busca {
    public static void main(String[] args) {

        int[] matrizBusca = {1, 3, 4, 2, 5, 6, 7, 8, 9, 10};
        int elementoBusca = 2;
        int posicao = -1;

        for (int i = 0; i < matrizBusca.length; i++) {
            if (elementoBusca == matrizBusca[i]) {
                posicao = i;
                break;
            }
        }

        if (posicao == -1) {
            System.out.println("Elemento não foi encontrado!");
        }

        System.out.println("Econtrei o elemento: " + elementoBusca + " na posição: " + posicao);
    }
}