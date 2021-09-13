package Estruturas;

public class Matrizes {

    public static void main(String[] args) {

        int[] arrayDeInteiros = new int[10];
        String[] operacoes = {"soma", "subtracao", "multiplicacao", "divisao"};

        int[][] matrizDeInteiros = new int[5][5];

        for (int i = 0; i < 10; i++) {
            System.out.println(operacoes[i]);
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println(matrizDeInteiros[i][j]);
            }
        }
    }
}
