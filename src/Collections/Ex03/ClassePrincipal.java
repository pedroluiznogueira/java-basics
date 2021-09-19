package Ex03;

import java.util.*;

public class ClassePrincipal {

    public static void main(String[] args) {

        // 1 -> As chaves são únicas
        // 2 -> Os valores são acessados por meio de chaves

        // criar map
        Map<Integer, String> map01 = new HashMap<>();

        // adicionar por chave e valor
        map01.put(1, "pedro");
        map01.put(2, "luiz");
        map01.put(3, "nogueira");
        map01.put(4, "mendes");

        // para consultar por chave, valor será retornado
        String valor = map01.get(1);
        System.out.println(valor);

        // para removermos por chave
        System.out.println(map01.get(2));
        map01.remove(2);
        System.out.println(map01.get(2));

        for (Integer chave: map01.keySet()) {
            String value = map01.get(chave);
            System.out.println(chave);
            System.out.println(value);
        }
    }

}
