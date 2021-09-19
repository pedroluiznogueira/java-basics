package ExPg01;

import java.util.*;

public class Dicionario {

    public static void main(String[] args) {
        List<String> listaStrings = new ArrayList<String>();
        String[] apelidos = {"Pedro", "Luiz", "Nogueira"};

        Map<Integer, List<String>> dicionarioLista = new HashMap<Integer, List<String>>();
        Map<Integer, String[]> dicionario = new HashMap<Integer, String[]>();

        dicionarioLista.put(1, listaStrings);
        dicionario.put(1, apelidos);

        for (Integer ap: dicionarioLista.keySet()) {
            String[] valueAp = dicionario.get(ap);
            System.out.println(valueAp);

            for (String sAp: valueAp) {
                System.out.println(sAp);
            }
        }

        System.out.println("=====================");

        for (Integer apelido: dicionario.keySet()) {
            String[] value = dicionario.get(apelido);
            System.out.println(value);

            for (String s: value) {
                System.out.println(s);
            }
        }
    }
}
