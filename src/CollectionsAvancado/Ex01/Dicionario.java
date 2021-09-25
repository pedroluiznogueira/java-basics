package CollectionsAvancado.Ex01;

import java.util.*;

public class Dicionario {

    public static void main(String[] args) {
        Map<Integer, String> dicionario = new HashMap<Integer, String>();

        dicionario.put(0, "Ovos");
        dicionario.put(1, "Água");
        dicionario.put(2, "Escopeta");
        dicionario.put(3, "Cavalo");
        dicionario.put(4, "Dentista");
        dicionario.put(5, "Fogo");

        for (Integer chave: dicionario.keySet()) {
            System.out.println(dicionario.get(chave));
        }
    }
}
