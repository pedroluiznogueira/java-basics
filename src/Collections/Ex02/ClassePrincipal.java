package Ex02;

import java.util.*;

public class ClassePrincipal {

    public static void main(String[] args) {

        // 1 -> Valores são do mesmo tipo
        // 2 -> A ordem da lista não é importante
        // 3-> Um objeto não pode estar duas vezes no mesmo conjunto, se repetir ele sobreescreve o valor anterior

        Set<String> conjuntoMinerador = new HashSet<String>();

        conjuntoMinerador.add("Corda");
        conjuntoMinerador.add("Lanterna");
        conjuntoMinerador.add("Picareta");
        conjuntoMinerador.add("Garrafa de água");

        conjuntoMinerador.remove("Corda");

        for (String minerador: conjuntoMinerador) {
            System.out.println(minerador);
        }
    }
}
