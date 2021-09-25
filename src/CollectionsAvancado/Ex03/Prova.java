package CollectionsAvancado.Ex03;

import java.util.*;

public abstract class Prova {
    private static int contador = 0;

    public static void somaTotal(Set<Integer> conjuntoDeInteiros) {
        conjuntoDeInteiros.forEach(Prova::somar);
        System.out.println(contador);
    }

    public static void somar(Integer inteiro) {
        contador += inteiro;
    }
}
