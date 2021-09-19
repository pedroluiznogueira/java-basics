package doacoes;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Set<String> listaDoacoes = new HashSet<String>();

        listaDoacoes.add("Biscoito");
        listaDoacoes.add("Macarrão");
        listaDoacoes.add("Banana");
        listaDoacoes.add("Arroz");
        listaDoacoes.add("Feijão");

        listaDoacoes.add("Moletom");
        listaDoacoes.add("Cachecol");
        listaDoacoes.add("Gorro");
        listaDoacoes.add("Jaqueta");
        listaDoacoes.add("Calças");

        listaDoacoes.remove("Macarrão");

        listaDoacoes.remove("Jaqueta");

        for (String valor: listaDoacoes) {
            System.out.println(valor);
        }
    }
}
