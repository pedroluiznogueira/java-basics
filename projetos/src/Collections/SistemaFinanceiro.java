package Collections;

import java.util.ArrayList;
import java.util.List;

public class SistemaFinanceiro {

    public static void main(String[] args) {
//        Cliente destinatario = new Cliente();
//        destinatario.setNome("Beltrano");
//        destinatario.setSobrenome("De tal");
//        Conta contaDestino = new ContaCorrente(destinatario);
//
//        CaixaEletronico caixaEletronico = new CaixaEletronico();
//        caixaEletronico.autenticar("2");
//        caixaEletronico.exibirSaldo();
//        caixaEletronico.efetuarDeposito(1000);
//        caixaEletronico.efetuarSaque(20);
//        caixaEletronico.efetuarTransferencia(contaDestino, 40);
//        caixaEletronico.encerrarUtilizacao();
        Cliente titular = new Cliente("Fabio", "Silva");
        Cliente outroTitular = new Cliente("Fulano", "De tal");
        Cliente maisUmTitular = new Cliente("Beltrano", "De tal");

        ContaConjunta contaConjunta = new ContaConjunta(titular);

        // Da para usar herança para adicionar elementos que não sejam do tipo Cliente diretamente
        List<Cliente> outrosTitulares = new ArrayList<>();
        outrosTitulares.add(outroTitular);
        outrosTitulares.add(outroTitular);
        outrosTitulares.add(maisUmTitular);
        contaConjunta.setOutrosTitulares(outrosTitulares);

        for (Cliente titulares : contaConjunta.getOutrosTitulares()) {
            System.out.println("Nome: " + titulares.getNome() + ", sobrenome: " + titulares.getSobrenome());
        }

        for (int i = 0; i < outrosTitulares.size(); i++) {
            Cliente titulares = outrosTitulares.get(i);
            System.out.println("Nome: " + titulares.getNome() + ", sobrenome: " + titulares.getSobrenome());
        }
    }
}
