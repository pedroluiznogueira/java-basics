package HerancaClasses;

public class ContaPoupanca extends Conta {
    private double taxaJuros;

    public ContaPoupanca() {
        super();

        this.taxaJuros = 0.03;
    }

    public double retirarJuros() {
        double saldoAtual = this.consultarSaldo();
        double jurosMes = this.taxaJuros * saldoAtual;

        return jurosMes;
    }


    public double getTaxaJuros() {
        return taxaJuros;
    }
}
