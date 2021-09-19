package Ex01;

import java.util.*;

public class ClassePrincipal {

    public static void main(String[] args) {

        // 1 -> Valores são do mesmo tipo
        // 2 -> Os elementos são ordenados indexação, e não se altera no decorrer do uso
        // 3 -> Um objeto pode estar duas vezes no mesmo conjunto

        // criando array list
        List<String> listaExemplo = new ArrayList<String>();

        // adicionar valores
        listaExemplo.add("A1");
        listaExemplo.add("B2");
        listaExemplo.add("C3");
        listaExemplo.add("D4");

        // remover por índice
        listaExemplo.remove(2);

        // para consultar por índice
        String valorDeColeta = listaExemplo.get(1);
        System.out.println(valorDeColeta);

        for (String valorASerObtido: listaExemplo) {
            System.out.println(valorASerObtido);
        }

    }
}
