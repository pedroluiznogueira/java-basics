package Collections;

import java.util.*;

public class SistemaFinanceiro {

    public static void main(String[] args) {
//        caixaEletronico.efetuarSaque(20);
//        caixaEletronico.efetuarTransferencia(contaDestino, 40);
//        caixaEletronico.encerrarUtilizacao();
//        Cliente titular = new Cliente("Fabio", "Silva");
//        Cliente outroTitular = new Cliente("Fulano", "De tal");
//        Cliente maisUmTitular = new Cliente("Beltrano", "De tal");
//
//        ContaConjunta contaConjunta = new ContaConjunta(titular);
//
//        // Da para usar herança para adicionar elementos que não sejam do tipo Cliente diretamente
//        List<Cliente> outrosTitulares = new Vector<Cliente>();
//        outrosTitulares.add(outroTitular);
//        outrosTitulares.add(outroTitular);
//        outrosTitulares.add(maisUmTitular);
//        contaConjunta.setOutrosTitulares(outrosTitulares);
//
//        for (Cliente titulares : contaConjunta.getOutrosTitulares()) {
//            System.out.println("Nome: " + titulares.getNome() + ", sobrenome: " + titulares.getSobrenome());
//        }
//
//        for (int i = 0; i < outrosTitulares.size(); i++) {
//            Cliente titulares = outrosTitulares.get(i);
//            System.out.println("Nome: " + titulares.getNome() + ", sobrenome: " + titulares.getSobrenome());
//        }

        // Classes wrappers encapsulam os comportamentos dos tipos primitivos
        // O set precisa vir de alguém que extende Object, e tipos primitivos não extendem nada

        // TreeSet ordena-os e não os repete
        Set<Integer> numeros = new TreeSet<Integer>();

        numeros.add(2);
        numeros.add(10);
        numeros.add(1);
        numeros.add(25);
        numeros.add(2);
        numeros.add(12);
        numeros.add(3);

        for (Integer numero: numeros) {
            System.out.println(numero);
        }


    }
}
