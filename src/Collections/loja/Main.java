package loja;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // criando ArrayList
        List<String> listaLoja = new ArrayList<String>();

        // adicionar à lista
        listaLoja.add("Laranja");
        listaLoja.add("Mamão");
        listaLoja.add("Biscoito");
        listaLoja.add("Pasta de Dente");
        listaLoja.add("Puruca Seca");

        // remover da lista
        listaLoja.remove(1);
        listaLoja.remove(2);

        // saída de dados
        for (String produtos: listaLoja) {
            System.out.println(produtos);
        }



    }



}
