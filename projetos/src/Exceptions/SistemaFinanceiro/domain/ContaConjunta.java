package Exceptions.SistemaFinanceiro.domain;

import Exceptions.SistemaFinanceiro.domain.Cliente;
import Exceptions.SistemaFinanceiro.domain.Conta;

import java.util.ArrayList;
import java.util.List;

public class ContaConjunta extends Conta {
    private List<Cliente> outrosTitulares = new ArrayList<Cliente>();

    public ContaConjunta(Cliente titular) {
        super(titular);
    }

    public List<Cliente> getOutrosTitulares() {
        return outrosTitulares;
    }

    public void setOutrosTitulares(List<Cliente> outrosTitulares) {
        this.outrosTitulares = outrosTitulares;
    }
}