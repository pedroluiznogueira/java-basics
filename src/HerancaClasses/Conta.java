package HerancaClasses;

public class Conta {
    private double saldo;
    private Cliente titular;

    public Conta() {}

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public double sacar(double valor) {
        if (valor > this.saldo) {
            System.out.println("Saldo insuficiente: ");
        } else {
            this.saldo -= valor;
        }
        return this.saldo;
    }

    public double consultarSaldo() {
        return this.saldo;
    }
}
