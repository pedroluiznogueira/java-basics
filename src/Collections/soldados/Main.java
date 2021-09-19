package soldados;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<String> listaComandos = new ArrayList<String>();

        listaComandos.add("A");
        listaComandos.add("B");
        listaComandos.add("C");
        listaComandos.add("D");
        listaComandos.add("E");
        listaComandos.add("F");
        listaComandos.add("G");
        listaComandos.add("H");
        listaComandos.add("I");
        listaComandos.add("J");
        listaComandos.add("K");
        listaComandos.add("L");
        listaComandos.add("M");
        listaComandos.add("N");
        listaComandos.add("O");

        for (String comando: listaComandos) {
            System.out.println(comando);
        }

        System.out.println("===========================");

        for (int i = 0; i < 5; i++) {
            String index = listaComandos.get(i);
            listaComandos.remove(index);
        }

        for (String comando: listaComandos) {
            System.out.println(comando);
        }
    }
}
