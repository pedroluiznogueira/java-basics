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

        // criando situação problema, o método vai acabar adicionando 1 (saldo = saldo - (-1))
        conta.sacar(-1);
        System.out.println(conta.consultarSaldo());
    }
}