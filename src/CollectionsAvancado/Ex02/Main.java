package CollectionsAvancado.Ex02;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        // Criando uma lista
        List<Integer> numerosLista = new ArrayList<Integer>();

        numerosLista.add(1);
        numerosLista.add(5);
        numerosLista.add(5);
        numerosLista.add(6);
        numerosLista.add(7);
        numerosLista.add(8);
        numerosLista.add(8);
        numerosLista.add(8);

        for (Integer numero: numerosLista) {
            System.out.println(numero);
        }

        System.out.println("=============== Utilizando forEach ====================");

        numerosLista.stream().forEach(System.out::println);

        System.out.println("===================================");

        // Criando um conjunto
        Set<Integer> numerosConjunto = new HashSet<Integer>();

        numerosConjunto.add(1);
        numerosConjunto.add(5);
        numerosConjunto.add(5);
        numerosConjunto.add(6);
        numerosConjunto.add(7);
        numerosConjunto.add(8);
        numerosConjunto.add(8);
        numerosConjunto.add(8);

        for (Integer numero: numerosConjunto) {
            // Os números que tentaram ser adicionados de forma repetida não serão repetidos
            System.out.println(numero);
        }

        System.out.println("=============== Utilizando forEach ====================");

        numerosConjunto.stream().forEach(System.out::println);
    }
}
