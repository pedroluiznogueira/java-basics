package CollectionsAvancado.PraticandoStream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        // criando uma lista de inteiros
        List<Integer> numeros = new ArrayList<Integer>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);

        // criando streams
        Stream<Integer> streamUm = numeros.stream();
        Stream<Integer> streamDois = numeros.stream();
        Stream<Integer> streamTres = numeros.stream();
        Stream<Integer> streamQuatro = numeros.stream();
        Stream<Integer> streamCinco = numeros.stream();
        Stream<Integer> streamSeis = numeros.stream();
        Stream<Integer> streamSete = numeros.stream();
        Stream<Integer> streamOito = numeros.stream();
        Stream<Integer> streamNove = numeros.stream();

        // imprimindo cada stream
        // streamUm.forEach(System.out::println);
        // streamDois.forEach(System.out::println);
        // streamTres.forEach(System.out::println);
        // streamQuatro.forEach(System.out::println);

        // forEach
        System.out.println("==== FOR EACH ====");
        streamUm.forEach(Multiplica::multiplicar);
        System.out.println("A lista ficou assim após o forEach: ");
        numeros.forEach(System.out::println);

        // map
        System.out.println("==== MAP ====");
        // Stream<Integer> mapStreamDois = streamDois.map(Soma::somar);
        List<Integer> listaStreamDois = streamDois.map(numero -> numero + 10).collect(Collectors.toList());
        listaStreamDois.forEach(System.out::println);
        System.out.println("A lista ficou assim após o Map: ");
        numeros.forEach(System.out::println);

        // filter
        System.out.println("==== FILTER ====");
        List<Integer> filterStreamTres =  streamTres.filter(Soma::somar).collect(Collectors.toList());
        filterStreamTres.forEach(System.out::println);

        // reduce
        System.out.println("==== REDUCE ====");
        Optional<Integer> reduceStreamQuatro = streamQuatro.reduce((num1, num2) -> num1 + num2);
        System.out.println(reduceStreamQuatro.get());

        // match
        System.out.println("==== ALL MATCH ====");
        boolean b = streamCinco.allMatch(numero -> numero > 0);
        System.out.println(b);

        System.out.println("==== ANY MATCH ====");
        boolean bo = streamSeis.anyMatch(numero -> numero > 0);
        System.out.println(bo);

        System.out.println("==== NONE MATCH ====");
        boolean boo = streamSete.noneMatch(numero -> numero > 0);
        System.out.println(boo);

        // max e min
        System.out.println("==== MIN ====");
        Integer min = streamOito.min(Integer::min).get();
        System.out.println(min);

        System.out.println("==== MAX ====");
        Integer max = streamNove.max(Integer::max).get();
        System.out.println(max);
    }
}
