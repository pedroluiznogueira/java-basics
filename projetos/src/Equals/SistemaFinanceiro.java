package Equals;

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
        Cliente cliente = new Cliente();
        cliente.setNome("Fabio");
        cliente.setSobrenome("Silva");

        System.out.println(cliente);

        // Representam coisas diferentes em memória
//        ContaCorrente conta1 = new ContaCorrente(cliente);
//        conta1.setNumero("12345");
//
//        ContaCorrente conta2 = new ContaCorrente(cliente);
//        conta1.setNumero("12345");

//        if (conta2.equals(null)) {
//            System.out.println("Objetos iguais");
//        } else {
//            System.out.println("Objetos diferentes");
//        }
//
//        if (conta2.equals(conta2)) {
//            System.out.println("Objetos iguais");
//        } else {
//            System.out.println("Objetos diferentes");
//        }
//
//        if (conta2.equals(conta1)) {
//            System.out.println("contas iguais");
//        } else {
//            System.out.println("contas diferentes");
//        }
    }
}
