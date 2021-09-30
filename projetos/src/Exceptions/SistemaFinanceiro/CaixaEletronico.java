package Exceptions.SistemaFinanceiro;

public class CaixaEletronico {

    private Conta conta;

    public void autenticar(String numeroConta) {
        Cliente cliente = new Cliente("Fulano", "De tal");
        cliente.setNome("Fulano");
        cliente.setSobrenome("De tal");

        ContaCorrente contaCorrente = new ContaCorrente(cliente, "2");

        this.conta = contaCorrente;

        System.out.println("Bem vindo cliente: " + cliente.getNome());
    }

    // posso passar tanto ContaCorrente como ContaPoupanca
    public void exibirSaldo() {
        if (this.conta == null) {
            System.out.println("Faca primeiro sua autenticação!");
        } else {
            System.out.println("O seu novo saldo é  " + this.conta.consultarSaldo());
        }
    }

    public void efetuarSaque(double valor) {
        if (this.conta == null) {
            System.out.println("Faca primeiro sua autenticação!");
        } else {
            this.conta.sacar(valor);
            System.out.println("Saque efetuado com sucesso");
            System.out.println("O seu saldo é " + this.conta.consultarSaldo());
        }
    }

    public void efetuarDeposito(double valor) {
        if (this.conta == null) {
            System.out.println("Faca primeiro sua autenticação!");
        } else {
            this.conta.depositar(valor);
            System.out.println("Deposito efetuado com sucesso");
            System.out.println("O seu saldo é " + this.conta.consultarSaldo());
        }
    }

    public void efetuarTransferencia(Conta destino, double valor) {
        if (this.conta == null) {
            System.out.println("Faca primeiro sua autenticação!");
        } else {
            this.conta.transferir(valor, destino);
            System.out.println("Transferência efetuada com sucesso");
            System.out.println("O seu saldo é " + this.conta.consultarSaldo());
        }
    }

    public void encerrarUtilizacao() {
        // null utilizado para liberar/ não usar mais uma variável, para podermos compará-lo
        this.conta = null;
    }
}