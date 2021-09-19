package Estruturas;

public class Somas {

    public static void main(String[] args) {

        int somaPares = 0;
        int somaImpares = 0;

        for (int i = 0; i < 20; i++) {

            if (i % 2 == 0) {
                somaPares += i;
                System.out.println("i: " + i);
                continue;
            }
            System.out.println("i: " + i);
            somaImpares += i;
        }

        System.out.println("Soma dos pares: " + somaPares);
        System.out.println("Soma dos ímpares: " + somaImpares);

    }
}
