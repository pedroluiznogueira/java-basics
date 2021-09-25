package CollectionsAvancado.Ex03;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Set<Integer> conjuntoInteiros =  new HashSet<Integer>();
        conjuntoInteiros.add(1);
        conjuntoInteiros.add(2);
        conjuntoInteiros.add(3);

        Prova.somaTotal(conjuntoInteiros);

    }
}
