package Exceptions.SistemaFinanceiro.domain;

import Exceptions.SistemaFinanceiro.domain.Cliente;
import Exceptions.SistemaFinanceiro.domain.Conta;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente titular) {
        super(titular);
    }
}