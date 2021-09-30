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

        } catch (IllegalArgumentException e) {
            System.out.println("Valor inválido: " + e.getMessage());

        } catch (Exception e) {
            System.out.println("Valor inválido: " + e.getMessage());
        }

        try {
            conta.sacar(10000);
        } catch (IllegalArgumentException | SaldoInsuficienteException e) {
            System.out.println("Valor inválido: " + e.getMessage());
        }

        // relacionando método transferência
        Conta contaDestino = new ContaCorrente(titular);
        // método sacar vai ser chamado por transferir
        conta.transferir(-1, contaDestino);

    }
}