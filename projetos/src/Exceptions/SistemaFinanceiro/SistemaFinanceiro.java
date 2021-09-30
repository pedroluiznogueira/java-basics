package Exceptions.SistemaFinanceiro;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SistemaFinanceiro {

    public static void main(String[] args) throws Exception {
        Cliente titular = new Cliente("Fábio", "Silva");
        Conta conta = new ContaCorrente(titular);

        conta.depositar(1000);
        System.out.println(conta.consultarSaldo());

        conta.sacar(10);
        System.out.println(conta.consultarSaldo());

        try {
            // criando situação problema, o método vai acabar adicionando 1 (saldo = saldo - (-1))
            conta.sacar(-1);
            System.out.println(conta.consultarSaldo());
        }
        // a excessão avisada vai ser tratada aqui
        catch (Exception e) {
            System.out.println("Valor inválido: " + e.getMessage());
        }

        try {
            conta.sacar(10000);
        }
        // a excessão avisada vai ser tratada aqui, mesmo que ao ser consumida aqui, não precise ser feita a diferença entre qual é
        catch (Exception e) {
            System.out.println("Valor inválido: " + e.getMessage());
        }
    }
}