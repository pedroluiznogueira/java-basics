package CollectionsAvancado.Challenge;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Integer> produtos = new ArrayList<Integer>();
        produtos.add(500);
        produtos.add(1000);
        produtos.add(5000);

        List<String> clientes = new ArrayList<String>();
        clientes.add("pedro");
        clientes.add("luiz");
        clientes.add("nogueira");

        Map<List<Integer>, List<String>> compras = new HashMap<>();
        compras.put(produtos, clientes);

        for (List<Integer> chave: compras.keySet()) {
            List<String> valores = compras.get(chave);

            // mapeando clientes para que seja impresso apenas os seus nomes
            List<String> nomes = valores.stream().map(Mapeia::mapear).toList();
            System.out.println("Nome dos clientes:");
            nomes.forEach(System.out::println);
        }

        for (List<Integer> chave: compras.keySet()) {
            Optional<Integer> totalVendas = chave.stream().reduce((num1, num2) -> num1 + num2);
            System.out.println("Total em vendas:");
            System.out.println(totalVendas.get());
        }

        // filtrando todos os produtos que tenham preço maior que 1000
        List<Integer> p =  produtos.stream().filter(produto -> produto > 1000).toList();
        System.out.println("Produto com preço maior do que R$1000:");
        p.forEach(System.out::println);

        for (List<Integer> chave: compras.keySet()) {
            List<String> valores = compras.get(chave);

            for (int i = 0; i < 1; i++) {
                System.out.println("Cliente: " + valores.get(i));
            }

            for (int i = 0; i < 1; i++) {
                System.out.println("Comprou: " + chave.get(i));
            }
        }



    }
}
