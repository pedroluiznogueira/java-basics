package Estruturas;


public class Loop {

    public static void main(String[] args) {
        int i = 0;

        while (retornarValorCondicao(i)) {
            System.out.println("Valor de i : " + i);
            i++;
        }

        do {
            System.out.println("valor de i: " + i);
            i++;
        } while (i < 10);

        for (int j = 0; j < 10; j++) {
            System.out.println("O valor de j: " + j);
        }

    }

    public static boolean retornarValorCondicao(int i) {
        return i < 10;
    }
}