package HerancaClasses;

public class ContaCorrente extends Conta{
    private double cheque;

    public ContaCorrente() {
        super();
    }

    private void depositarCheque(double valor) {
        this.cheque += valor;
    }

    public double sacarCC(double valor) {
        double saldo = this.sacar(valor);
        if (valor > saldo) {
            this.cheque -= valor;
            return this.cheque;
        } else {
            saldo -= valor;
            return saldo;
        }
    }
}